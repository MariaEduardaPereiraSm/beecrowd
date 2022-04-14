var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


let valor = parseInt(lines.shift());
let x = 1;

for(let i = 0; i<valor; i++){
conta = valor - i;
mult = conta*x;
x= mult;

}
console.log(mult);
