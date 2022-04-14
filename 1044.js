var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
 let [A, B] = lines.shift().split(" ");

 if(B%A === 0){
console.log(`Sao Multiplos`);
 }
 if(A%B === 0){
    console.log(`Sao Multiplos`); 
 }
 if(A%B && B%A !== 0){
    console.log(`Nao sao Multiplos`); 
 }
