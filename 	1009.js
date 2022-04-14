var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let nome = parseInt(lines.shift());
let sf = parseFloat(lines.shift());
let mt = parseFloat(lines.shift());
let valor = ((15* mt)/100) + sf;
console.log(`TOTAL = R$ ${valor.toFixed(2)}`);
