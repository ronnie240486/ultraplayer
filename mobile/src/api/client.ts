import { Platform } from 'react-native';

const PANEL_BASE = process.env.EXPO_PUBLIC_PANEL_BASE || 'https://renciaapp.manus.space/api/v5';
const PROXY_BASE = process.env.EXPO_PUBLIC_BACKEND_URL
  ? `${process.env.EXPO_PUBLIC_BACKEND_URL}/api/iptv-proxy`
  : '';

const commonHeaders: Record<string, string> = {
  Accept: 'application/json, text/plain, */*',
};

/** Usa o proxy somente no preview web; o APK chama o painel diretamente. */
export function proxied(url: string): string {
  if (Platform.OS === 'web' && PROXY_BASE) {
    return `${PROXY_BASE}?url=${encodeURIComponent(url)}`;
  }
  return url;
}

async function safeJson<T>(res: Response): Promise<T | null> {
  try {
    return (await res.json()) as T;
  } catch {
    return null;
  }
}

export type Playlist = {
  name: string;
  url: string;
  type?: string;
};

export type MacStatus = {
  authorized: boolean;
  registered: boolean;
  mac: string;
  auth_mode?: 'mac' | 'credentials';
  username?: string;
  status?: string;
  expire_date?: string | null;
  playlists?: Playlist[];
  logo_url?: string;
  bg_url?: string;
  banner_url?: string;
  app_name?: string;
  whatsapp_url?: string;
  reseller_contact?: string;
  reseller_whatsapp?: string;
  version?: string;
  apk_link?: string;
  message?: string;
  server_name?: string;
  tipo?: string;
  raw?: Record<string, unknown>;
};

function normalize(json: any, fallback: string, authMode: 'mac' | 'credentials', username?: string): MacStatus {
  if (!json || typeof json !== 'object') {
    return { authorized: false, registered: false, mac: fallback, auth_mode: authMode, username };
  }

  const registered =
    json.mac_registered === true ||
    json.registered === true ||
    json.registered === 1 ||
    json.registered === '1' ||
    json.found === true ||
    (authMode === 'credentials' && json.success === true);

  const allowed = json.authorized === true || json.allowed === true || (json.success === true && registered);

  let playlists: Playlist[] | undefined;
  if (Array.isArray(json.playlists) && json.playlists.length > 0) {
    playlists = json.playlists
      .map((p: any) => ({
        name: p.name || p.playlist_name || 'Playlist',
        url: p.url || p.playlist_url || '',
        type: p.type,
      }))
      .filter((p: Playlist) => !!p.url);
  } else if (typeof json.playlist_url === 'string' && json.playlist_url) {
    playlists = [{ name: json.playlist_name || 'Playlist', url: json.playlist_url, type: json.type }];
  } else if (typeof json.urlM3u8 === 'string' && json.urlM3u8) {
    playlists = [{ name: json.nomeServer || 'Playlist', url: json.urlM3u8, type: 'm3u_plus' }];
  }

  return {
    authorized: !!(registered && allowed && playlists?.length),
    registered: !!registered,
    mac: json.mac || fallback,
    auth_mode: json.login_mode === 'credentials' ? 'credentials' : authMode,
    username: json.username || username,
    status: json.status,
    expire_date: json.dataExpiracao || json.expire_date || null,
    playlists,
    logo_url: json.logo_url,
    bg_url: json.bg_url,
    banner_url: json.banner_url,
    app_name: json.app_name || json.app,
    whatsapp_url: json.whatsapp_url,
    reseller_contact: json.reseller_contact,
    reseller_whatsapp: json.reseller_whatsapp,
    version: json.version,
    apk_link: json.apk_link,
    message: json.error || json.message || json.mensagem,
    server_name: json.nomeServer,
    tipo: json.tipo,
    raw: json,
  };
}

export async function checkMac(mac: string): Promise<MacStatus> {
  const upstream = `${PANEL_BASE}/check_mac.php?mac=${encodeURIComponent(mac)}`;
  try {
    const res = await fetch(proxied(upstream), { headers: commonHeaders });
    const json = await safeJson<any>(res);
    if (!json) return { authorized: false, registered: false, mac, auth_mode: 'mac', message: 'Resposta inválida.' };
    return normalize(json, mac, 'mac');
  } catch {
    return { authorized: false, registered: false, mac, auth_mode: 'mac', message: 'Falha de conexão.' };
  }
}

export async function loginCredentials(username: string, password: string): Promise<MacStatus> {
  const upstream = `${PANEL_BASE}/login.php`;
  try {
    const res = await fetch(proxied(upstream), {
      method: 'POST',
      headers: { ...commonHeaders, 'Content-Type': 'application/json' },
      body: JSON.stringify({ username: username.trim(), password }),
    });
    const json = await safeJson<any>(res);
    if (!json) return { authorized: false, registered: false, mac: '', auth_mode: 'credentials', username, message: 'Resposta inválida.' };
    return normalize(json, json.mac || '', 'credentials', username);
  } catch {
    return { authorized: false, registered: false, mac: '', auth_mode: 'credentials', username, message: 'Falha de conexão.' };
  }
}

export async function checkExpire(mac: string): Promise<{ expired: boolean; expire_date?: string | null }> {
  const upstream = `${PANEL_BASE}/check_expire.php?mac=${encodeURIComponent(mac)}`;
  try {
    const res = await fetch(proxied(upstream), { headers: commonHeaders });
    const json = await safeJson<any>(res);
    if (!json) return { expired: true };
    return { expired: !!json.expired, expire_date: json.expire_date };
  } catch {
    return { expired: true };
  }
}
