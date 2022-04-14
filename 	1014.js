var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let d = parseInt(lines.shift());
let gc = parseFloat(lines.shift());
let x = d/gc;
console.log(`${x.toFixed(3)} km/l`);
