var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


let [horai, minutoi, horaf, minutof] = lines.shift().split(" ");
let ht= horaf - horai;
let mt = minutof - minutoi;

 if(ht === 0 && mt===0){
  ht += 24;
    
 }
 if(mt < 0){
  ht--;
 mt += 60;

 }
 if(ht <0){
    ht += 24;
 }
 console.log(`O JOGO DUROU ${ht} HORA(S) E ${mt} MINUTO(S)`)
