var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

 let valor;
 let ordem = "";
 do{
   valor = lines.shift().split(" ");
   for(let i =1; i<=valor -1; i++){
 ordem+= `${i} `;
 
 
   }
   if(valor!=0){
   console.log(`${ordem}${valor}`);}
   ordem = "";
 }while(valor!=0)
