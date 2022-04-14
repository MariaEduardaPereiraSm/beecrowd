var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let [a,b] = lines.shift().split(" ");

 let conta = ((b/a)*100) - 100;

 console.log(`${conta.toFixed(2)}%`);
