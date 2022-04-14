var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');



let[x,y,z]= lines.shift().split(" ");
let min2;
let maior;

 let min1 = Math.min(x,Math.min(y,z));

 if(min1 == x){

    min2 = Math.min(y,z);
   maior = Math.max(y,z);
 }
 if(min1 == y){
     min2 = Math.min(x,z);
      maior = Math.max(x,z);
 }
 if(min1 == z){
     
   min2 = Math.min(x,y);
    maior = Math.max(x,y);
 }

 console.log(`${min1}\n${min2}\n${maior}\n`);
 console.log(`${x}\n${y}\n${z}`);

