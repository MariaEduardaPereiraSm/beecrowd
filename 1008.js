var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let nf = parseInt(lines.shift());
let ht = parseInt(lines.shift());
let vh = parseFloat(lines.shift());

let salario = ht* vh;
console.log(`NUMBER = ${nf}\nSALARY = U$ ${salario.toFixed(2)}`);

