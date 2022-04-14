var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let [A, B, C] = lines.shift().split(" ");

let delta = Math.pow(B,2) - (4*A*C);
if(A > 0 && delta > 0){
    let formulap = (-B + Math.sqrt(delta))/ (2*A);

let formulan = (-B - Math.sqrt(delta))/ (2*A);

console.log(`R1 = ${formulap.toFixed(5)}\nR2 = ${formulan.toFixed(5)}`);
}

else{
    console.log('Impossivel calcular');
}

