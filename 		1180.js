var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let min= 0
 tmpmMin = 0
  position = 0;
 checkFirst = false;

        let n = parseInt(lines.shift());
        values = lines.shift().split(' ');
       let valor = [];
        for (let i = 0; i < n; i++) {
             parseInt(lines.shift());
          valor.push(parseInt(values.shift()));
        }

        for (let j = 0; j < n; j++) {
            tmpmMin = valor[j];
            if (checkFirst == false) {
                min = tmpmMin;
                checkFirst = true;
            }

            if (tmpmMin < min) {
               min = tmpmMin;
                position = j;

            }

        }
        console.log(`Menor valor: ${min}`);
        console.log(`Posicao: ${position}`);
