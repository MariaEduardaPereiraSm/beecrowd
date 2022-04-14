var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let [x, y] = lines.shift().split(" ");
let cont = 0;
let imprimir = ""
for (i = 1; i < y; i++){
    cont += 1;
    if (cont == x) {
        cont = 0;
        imprimir += `${i}\n`;
    }else{
        imprimir += `${i} `;
    }

}

imprimir += `${y}`;
console.log(imprimir);
