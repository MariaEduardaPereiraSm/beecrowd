var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

 let valor = parseInt(lines.shift());
 
 let nota100= Math.trunc(valor/100);
 let resto100= Math.trunc(valor%100);
 let nota50 = Math.trunc(resto100/50);
 let resto50 = Math.trunc(resto100%50);
 let nota20 = Math.trunc(resto50/20);
 let resto20 = Math.trunc(resto50%20);
 let nota10 = Math.trunc(resto20/10);
 let resto10 = Math.trunc(resto20%10);
 let nota5 = Math.trunc(resto10/5);
 let resto5= Math.trunc(resto10%5);
 let nota2 = Math.trunc(resto5/2);
 let resto2 = Math.trunc(resto5%2);
 let nota1 = Math.trunc(resto2/1);

 console.log(`${valor}\n${nota100} nota(s) de R$ 100,00\n${nota50} nota(s) de R$ 50,00\n${nota20} nota(s) de R$ 20,00\n${nota10} nota(s) de R$ 10,00\n${nota5} nota(s) de R$ 5,00\n${nota2} nota(s) de R$ 2,00\n${nota1} nota(s) de R$ 1,00`);
