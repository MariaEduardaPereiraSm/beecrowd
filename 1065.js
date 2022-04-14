var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let cont =0;
for(let i =0; i<5;i++){
    let x = parseInt(lines.shift());
    if(x%2==0){
        cont++;
    }
}
console.log(`${cont} valores pares`)
