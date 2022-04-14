var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

 let valor = parseInt(lines.shift());
  let horas = Math.trunc(valor/3600); //horas 
  if(horas===0){
      
      let minutos = Math.trunc(valor/60);
      let segundos = valor%60;
      console.log(`${horas}:${minutos}:${segundos}`);

  }else{

  let resto= valor%3600;
 
  let minutos = Math.trunc(resto/60);
  let segundos2 = resto%60; 

  console.log(`${horas}:${minutos}:${segundos2}`);
  }
