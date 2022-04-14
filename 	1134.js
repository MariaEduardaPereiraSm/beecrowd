var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
let alcool = 0;
let gasolina =0;
let diesel = 0;
let valor;

do{
    valor = lines.shift().split(" ");

    if(valor == 1){
    alcool++;
    }
    if(valor == 2){
        gasolina++;
    }
    if(valor == 3){
        diesel++;
    }
    
} while(valor!=4 )

console.log(`MUITO OBRIGADO`);
console.log(`Alcool: ${alcool}`);
console.log(`Gasolina: ${gasolina}`);
console.log(`Diesel: ${diesel}`);
