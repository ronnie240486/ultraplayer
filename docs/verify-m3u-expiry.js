const assert = require('node:assert/strict');

function expiryFromListUrl(url) {
  const raw = String(url || '').trim();
  if (!raw) return '';
  const keys = ['exp_date', 'expire_date', 'expires', 'expires_at', 'expiration', 'expiration_date', 'valid_until', 'validUntil', 'expiry', 'expiresAt'];
  try {
    const u = new URL(raw);
    for (const key of keys) {
      const value = u.searchParams.get(key);
      if (value) return value;
    }
  } catch (_) {}
  return '';
}

function expiryTimestamp(value) {
  if (value === null || value === undefined || value === '') return 0;
  if (typeof value === 'number' && Number.isFinite(value)) return value > 20000000000 ? Math.floor(value / 1000) : Math.floor(value);
  const s = String(value).trim();
  if (/^\d+$/.test(s)) {
    const n = Number(s);
    return n > 20000000000 ? Math.floor(n / 1000) : Math.floor(n);
  }
  const d = new Date(s);
  return Number.isNaN(d.getTime()) ? 0 : Math.floor(d.getTime() / 1000);
}

assert.equal(expiryFromListUrl('https://iptv.example/get.php?username=u&password=p&expires=2027-08-14'), '2027-08-14');
assert.equal(expiryTimestamp('2027-08-14') > 0, true);
assert.equal(expiryTimestamp('1797292800'), 1797292800);
const listExpiry = expiryFromListUrl('https://iptv.example/get.php?exp_date=1797292800');
const panelExpiry = '2030-01-01';
assert.equal(listExpiry, '1797292800');
assert.notEqual(listExpiry, panelExpiry);
console.log('M3U_EXPIRY_TEST_OK');
