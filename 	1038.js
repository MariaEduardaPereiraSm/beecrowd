var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let [codigo, quantidade] = lines.shift().split(' ');
let conta =0;

if(codigo == 1){
    conta = quantidade* 4.0;
}

else if(codigo == 2){
     conta = quantidade* 4.5;
}

else if(codigo == 3){
     conta = quantidade* 5.0;
}

else if(codigo == 4){
     conta = quantidade* 2.0;
}

else if(codigo == 5){
     conta = quantidade* 1.5;
}
console.log(`Total: R$ ${conta.toFixed(2)}`);
