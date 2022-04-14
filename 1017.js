var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
let hora = parseInt(lines.shift());
let vm = parseInt(lines.shift());
let conversao = (hora* vm)/12;
console.log(`${conversao.toFixed(3)}`);
