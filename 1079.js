var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

 var numero = parseInt(lines.shift());
 for(let i=0; i<numero;i++){
     var [n1, n2, n3] = lines.shift().split(" ");
     let conta = ((n1*2) + (n2*3) + (n3*5))/10;
console.log(`${conta.toFixed(1)}`);
 }
