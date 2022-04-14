var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let x = parseInt(lines.shift());
let y = parseInt(lines.shift());


        if (y<x) {
            let temp = y;
            y = x;
            x = temp;
        }
        let soma =0;
   
    for(let i = x; i <=y; i++) {
        if(i%13 != 0){
         soma+=i;
    }
}

console.log(`${soma}`);
