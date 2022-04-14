var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let N = parseInt(lines.shift());
let X = [0, 1];

for (let j = 2; j < N; j++){
    X[j] = X[j-1] +  X[j-2] ;
}
console.log(X.join(" "));
