var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let X = lines.shift();
let Y = lines.shift();
let Z = lines.shift();

if (X == 'vertebrado' & Y == 'ave' & Z =='carnivoro') {
console.log('aguia');
}
if (X == 'vertebrado' & Y =='ave' & Z == 'onivoro') {
 console.log('pomba');
}
if (X == 'vertebrado' & Y =='mamifero' & Z == 'onivoro') {
  console.log('homem');
}
if (X =='vertebrado' & Y =='mamifero' & Z =='herbivoro') {
console.log('vaca');
}
if (X =='invertebrado' & Y =='inseto' & Z == 'hematofago') {
    console.log('pulga');
}
if (X =='invertebrado' & Y =='inseto' & Z == 'herbivoro') {
 console.log('lagarta');
}
if (X =='invertebrado'  & Y == 'anelideo'  & Z == 'hematofago'){
console.log('sanguessuga');
}
if (X =='invertebrado' & Y == 'anelideo' & Z =='onivoro') {
  console.log('minhoca');
}
