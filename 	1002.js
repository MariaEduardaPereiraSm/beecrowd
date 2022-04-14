var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let raio = parseFloat(lines.shift());
let conta = (Math.pow(raio,2))*3.14159;
console.log(`A=${conta.toFixed(4)}`);
