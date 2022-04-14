var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor = parseInt(lines.shift());

let ano = Math.trunc(valor/365);
let resto = valor%365;
let meses = Math.trunc(resto/30);
let dias = resto%30;

console.log(`${ano} ano(s)\n${meses} mes(es)\n${dias} dia(s)`);

