var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


let valor = parseFloat(lines.shift());

if(valor>0 && valor<=2000){
console.log(`Isento`);
}

if(valor> 2000 && valor<=3000){
     let tirar= valor - 2000;
    let imposto = (tirar*8)/100;
    console.log(`R$ ${imposto.toFixed(2)}`);
}
if(valor>3000 && valor <=4500){
    let tirar= valor - 3000;
    let fixo= 80;

    let imposto = ((tirar*18)/100) + fixo;
    console.log(`R$ ${imposto.toFixed(2)}`);
}
if(valor > 4500){
    let tirar = valor - 4500;
    let fixo= 80 + 270;
    let imposto = ((tirar*28)/100) + fixo;
    console.log(`R$ ${imposto.toFixed(2)}`);
}
