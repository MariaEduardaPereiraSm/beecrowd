# -*- coding: utf-8 -*-
n1=0
n2 =0
codigo =int(1)
while codigo ==1:
  while n1>0 or n1<10: 
    n1 = float(input())
    if(n1<0 or n1>10):
     print('nota invalida')
    else:
     break;

  while n2>0 or n2<10:
    n2 = float(input())
    if(n2<0 or n2>10):
     print('nota invalida')
    else:
     break;

  if(n1>=0 and n1<=10 and n2>=0 and n2<=10):
   media= (n1+n2)/2
   print('media = %.2f'%media)

  codigo = int(0)
  while(codigo!=1 and codigo!=2):
    print('novo calculo (1-sim 2-nao)')
    codigo = int(input())
    if(codigo==2):
        break;
