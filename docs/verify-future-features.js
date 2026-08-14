const fs = require('fs');
const path = '/home/ubuntu/ultraplayer/native-webview/app/src/main/assets/webui/zlocal.js';
const javaPath = '/home/ubuntu/ultraplayer/native-webview/app/src/main/java/com/ultraplayer/app/MainActivity.java';
const js = fs.readFileSync(path, 'utf8');
const java = fs.readFileSync(javaPath, 'utf8');
const requiredJs = [
  'function renderUniversalSearch()',
  'function universalSearchRun(query)',
  'function voiceEpgIntent(text)',
  'function homeRecommendationItems()',
  'function fillHomeRecommendations()',
  'function applyAccessibility()',
  'function showAmbient()',
  'function profileUsageTick()',
  "if (p === '/search') return renderUniversalSearch();",
  'id="zhReco"'
];
const requiredJava = ['public void miniPause()', 'public void miniResume()', 'public void miniFullscreen()'];
for (const needle of requiredJs) if (!js.includes(needle)) throw new Error(`JS ausente: ${needle}`);
for (const needle of requiredJava) if (!java.includes(needle)) throw new Error(`Java ausente: ${needle}`);
console.log(`OK: ${requiredJs.length} itens JS e ${requiredJava.length} itens Java verificados.`);
