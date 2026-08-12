import { useCallback, useEffect, useRef, useState } from 'react';
import {
  ActivityIndicator,
  ImageBackground,
  KeyboardAvoidingView,
  Platform,
  Pressable,
  ScrollView,
  StyleSheet,
  Text,
  TextInput,
  View,
} from 'react-native';
import { Image } from 'expo-image';
import { SafeAreaView } from 'react-native-safe-area-context';
import * as Clipboard from 'expo-clipboard';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';

import { colors, spacing } from '@/src/theme';
import { getDeviceMac } from '@/src/lib/device';
import { checkMac, loginCredentials, MacStatus } from '@/src/api/client';
import { saveSession, loadSession } from '@/src/state/session';

const formatMac = (value: string): string => {
  const hex = value.replace(/[^0-9a-f]/gi, '').toUpperCase().slice(0, 12);
  return hex.match(/.{1,2}/g)?.join(':') || '';
};

export default function LoginScreen() {
  const router = useRouter();
  const [mode, setMode] = useState<'mac' | 'credentials'>('mac');
  const [mac, setMac] = useState('');
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [status, setStatus] = useState<MacStatus | null>(null);
  const [checking, setChecking] = useState(false);
  const [copied, setCopied] = useState(false);
  const mountedRef = useRef(true);

  useEffect(() => {
    mountedRef.current = true;
    (async () => {
      const cached = await loadSession();
      if (cached?.authorized) {
        router.replace('/profiles');
        return;
      }
      const generated = await getDeviceMac();
      if (mountedRef.current) setMac(formatMac(generated));
    })();
    return () => {
      mountedRef.current = false;
    };
  }, [router]);

  const finishLogin = useCallback(async (result: MacStatus) => {
    if (!mountedRef.current) return;
    setStatus(result);
    if (result.authorized) {
      await saveSession(result);
      if (mountedRef.current) router.replace('/profiles');
    }
  }, [router]);

  const onMacLogin = async () => {
    const normalized = formatMac(mac);
    setMac(normalized);
    if (normalized.replace(/:/g, '').length !== 12) {
      setStatus({ authorized: false, registered: false, mac: normalized, message: 'Digite um MAC com 12 dígitos hexadecimais.' });
      return;
    }
    setChecking(true);
    const result = await checkMac(normalized);
    setChecking(false);
    await finishLogin(result);
  };

  const onCredentialsLogin = async () => {
    if (!username.trim() || !password) {
      setStatus({ authorized: false, registered: false, mac: '', auth_mode: 'credentials', username, message: 'Preencha usuário e senha.' });
      return;
    }
    setChecking(true);
    const result = await loginCredentials(username, password);
    setChecking(false);
    await finishLogin(result);
  };

  const onCopy = async () => {
    if (!mac) return;
    await Clipboard.setStringAsync(mac);
    setCopied(true);
    setTimeout(() => setCopied(false), 1600);
  };

  const bg = status?.bg_url;
  const logo = status?.logo_url;
  const appName = status?.app_name || 'UltraPlayer';
  const errorText = status && !status.authorized ? status.message : '';

  return (
    <ImageBackground source={bg ? { uri: bg } : undefined} style={styles.bg} imageStyle={styles.bgImage}>
      <KeyboardAvoidingView style={styles.flex} behavior={Platform.OS === 'ios' ? 'padding' : undefined}>
        <SafeAreaView style={styles.safe} edges={['top', 'bottom']}>
          <ScrollView contentContainerStyle={styles.scroll} keyboardShouldPersistTaps="handled">
            <View style={styles.logoWrap}>
              {logo ? (
                <Image source={{ uri: logo }} style={styles.logoImg} contentFit="contain" />
              ) : (
                <View style={styles.logoCircle} testID="app-logo">
                  <Ionicons name="play" size={30} color={colors.black} />
                </View>
              )}
            </View>

            <Text style={styles.title}>Como entrar</Text>
            <Text style={styles.subtitle}>Escolha uma opção de acesso ao {appName}</Text>

            <View style={styles.modeRow}>
              <Pressable onPress={() => { setMode('mac'); setStatus(null); }} style={[styles.modeButton, mode === 'mac' && styles.modeButtonActive]}>
                <Ionicons name="hardware-chip-outline" size={18} color={mode === 'mac' ? colors.black : colors.accentCyan} />
                <Text style={[styles.modeText, mode === 'mac' && styles.modeTextActive]}>MAC</Text>
              </Pressable>
              <Pressable onPress={() => { setMode('credentials'); setStatus(null); }} style={[styles.modeButton, mode === 'credentials' && styles.modeButtonActive]}>
                <Ionicons name="person-outline" size={18} color={mode === 'credentials' ? colors.black : colors.accentCyan} />
                <Text style={[styles.modeText, mode === 'credentials' && styles.modeTextActive]}>Usuário e senha</Text>
              </Pressable>
            </View>

            <View style={styles.card}>
              {mode === 'mac' ? (
                <>
                  <Text style={styles.label}>MAC DO DISPOSITIVO</Text>
                  <TextInput
                    value={mac}
                    onChangeText={(value) => setMac(formatMac(value))}
                    placeholder="AA:BB:CC:DD:EE:FF"
                    placeholderTextColor={colors.textMuted}
                    autoCapitalize="characters"
                    autoCorrect={false}
                    maxLength={17}
                    keyboardType="ascii-capable"
                    style={styles.inputMac}
                    testID="mac-input"
                  />
                  <Pressable onPress={onCopy} style={styles.copyButton} hitSlop={8}>
                    <Ionicons name="copy-outline" size={15} color={colors.accentCyan} />
                    <Text style={styles.copyText}>{copied ? 'Copiado' : 'Copiar MAC'}</Text>
                  </Pressable>
                  <Text style={styles.hint}>Informe os 12 dígitos cadastrados pelo seu revendedor.</Text>
                  <Pressable onPress={onMacLogin} disabled={checking} style={[styles.submit, checking && styles.disabled]} testID="mac-login-submit">
                    {checking ? <ActivityIndicator color={colors.black} /> : <Ionicons name="log-in-outline" size={20} color={colors.black} />}
                    <Text style={styles.submitText}>{checking ? 'Verificando...' : 'Entrar com MAC'}</Text>
                  </Pressable>
                </>
              ) : (
                <>
                  <Text style={styles.label}>USUÁRIO</Text>
                  <TextInput
                    value={username}
                    onChangeText={setUsername}
                    placeholder="Digite seu usuário"
                    placeholderTextColor={colors.textMuted}
                    autoCapitalize="none"
                    autoCorrect={false}
                    style={styles.input}
                    testID="username-input"
                  />
                  <Text style={[styles.label, styles.passwordLabel]}>SENHA</Text>
                  <TextInput
                    value={password}
                    onChangeText={setPassword}
                    placeholder="Digite sua senha"
                    placeholderTextColor={colors.textMuted}
                    secureTextEntry
                    autoCapitalize="none"
                    autoCorrect={false}
                    style={styles.input}
                    testID="password-input"
                  />
                  <Text style={styles.hint}>Use as credenciais fornecidas pelo seu revendedor.</Text>
                  <Pressable onPress={onCredentialsLogin} disabled={checking} style={[styles.submit, checking && styles.disabled]} testID="credentials-login-submit">
                    {checking ? <ActivityIndicator color={colors.black} /> : <Ionicons name="log-in-outline" size={20} color={colors.black} />}
                    <Text style={styles.submitText}>{checking ? 'Validando...' : 'Entrar com usuário'}</Text>
                  </Pressable>
                </>
              )}

              {!!errorText && (
                <View style={styles.errorBox}>
                  <Ionicons name="alert-circle-outline" size={17} color={colors.danger} />
                  <Text style={styles.errorText}>{errorText}</Text>
                </View>
              )}
              {status?.authorized && (
                <View style={styles.successBox}>
                  <Ionicons name="checkmark-circle-outline" size={17} color={colors.accentCyan} />
                  <Text style={styles.successText}>Acesso autorizado. Abrindo o aplicativo...</Text>
                </View>
              )}
            </View>

            <Pressable onPress={() => router.push('/diagnostic')} style={styles.diagButton} hitSlop={12}>
              <Ionicons name="pulse" size={13} color={colors.textMuted} />
              <Text style={styles.diagText}>Diagnosticar conexão</Text>
            </Pressable>
            <Text style={styles.footer}>{appName}</Text>
          </ScrollView>
        </SafeAreaView>
      </KeyboardAvoidingView>
    </ImageBackground>
  );
}

const styles = StyleSheet.create({
  flex: { flex: 1 },
  bg: { flex: 1, backgroundColor: colors.black },
  bgImage: { opacity: 0.25 },
  safe: { flex: 1, paddingHorizontal: spacing.lg },
  scroll: { flexGrow: 1, justifyContent: 'center', alignItems: 'center', paddingVertical: spacing.lg },
  logoWrap: { alignItems: 'center', marginBottom: spacing.md },
  logoCircle: { width: 72, height: 72, borderRadius: 20, backgroundColor: colors.accentCyan, alignItems: 'center', justifyContent: 'center' },
  logoImg: { width: 128, height: 76 },
  title: { color: colors.white, fontSize: 28, fontWeight: '800', textAlign: 'center' },
  subtitle: { color: colors.textSecondary, fontSize: 13, textAlign: 'center', marginTop: spacing.xs, marginBottom: spacing.lg },
  modeRow: { width: '100%', maxWidth: 520, flexDirection: 'row', gap: spacing.sm, marginBottom: spacing.md },
  modeButton: { flex: 1, minHeight: 48, flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: spacing.xs, borderWidth: 1, borderColor: colors.darkSurfaceAlt, borderRadius: 12, backgroundColor: colors.darkSurface },
  modeButtonActive: { backgroundColor: colors.accentCyan, borderColor: colors.accentCyan },
  modeText: { color: colors.accentCyan, fontWeight: '800', fontSize: 12 },
  modeTextActive: { color: colors.black },
  card: { width: '100%', maxWidth: 520, backgroundColor: 'rgba(22,27,46,0.96)', borderRadius: 18, padding: spacing.lg, borderWidth: 1, borderColor: colors.darkSurfaceAlt },
  label: { color: colors.textSecondary, fontSize: 11, letterSpacing: 1.4, fontWeight: '700', marginBottom: spacing.sm },
  passwordLabel: { marginTop: spacing.md },
  input: { width: '100%', minHeight: 52, borderWidth: 1, borderColor: colors.darkSurfaceAlt, backgroundColor: colors.black, color: colors.white, borderRadius: 10, paddingHorizontal: spacing.md, fontSize: 16 },
  inputMac: { width: '100%', minHeight: 58, borderWidth: 1, borderColor: colors.darkSurfaceAlt, backgroundColor: colors.black, color: colors.accentCyan, borderRadius: 10, paddingHorizontal: spacing.md, fontSize: 22, fontWeight: '800', letterSpacing: 1.5, textAlign: 'center' },
  copyButton: { alignSelf: 'center', flexDirection: 'row', alignItems: 'center', gap: 6, paddingVertical: spacing.sm },
  copyText: { color: colors.accentCyan, fontSize: 12, fontWeight: '700' },
  hint: { color: colors.textMuted, fontSize: 12, lineHeight: 18, textAlign: 'center', marginTop: spacing.sm },
  submit: { minHeight: 52, marginTop: spacing.lg, borderRadius: 12, backgroundColor: colors.accentCyan, flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: spacing.sm },
  disabled: { opacity: 0.55 },
  submitText: { color: colors.black, fontSize: 14, fontWeight: '900', letterSpacing: 0.5 },
  errorBox: { marginTop: spacing.md, padding: spacing.sm, borderRadius: 10, backgroundColor: 'rgba(240,153,123,0.12)', flexDirection: 'row', alignItems: 'center', gap: spacing.sm },
  errorText: { flex: 1, color: colors.danger, fontSize: 12 },
  successBox: { marginTop: spacing.md, padding: spacing.sm, borderRadius: 10, backgroundColor: 'rgba(76,232,240,0.12)', flexDirection: 'row', alignItems: 'center', gap: spacing.sm },
  successText: { flex: 1, color: colors.accentCyan, fontSize: 12 },
  diagButton: { flexDirection: 'row', alignItems: 'center', gap: 6, paddingVertical: spacing.md },
  diagText: { color: colors.textMuted, fontSize: 11, textDecorationLine: 'underline' },
  footer: { color: colors.textMuted, fontSize: 11, marginTop: spacing.xs, letterSpacing: 1 },
});
