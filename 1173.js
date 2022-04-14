var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor = parseInt(lines.shift());
let vetor = [];
vetor.unshift(valor);

for(let i=1; i < 10; i++){
   valor = valor*2;
   vetor.push(valor);

}
for(let j = 0; j <10;j++){
  console.log(`N[${j}] = ${vetor[j]}`);

}



