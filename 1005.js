var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n1 = parseFloat(lines.shift());
let n2 = parseFloat(lines.shift());
let conta = ((n1*3.5) + (n2*7.5)) / 11;
console.log(`MEDIA = ${conta.toFixed(5)}`);
