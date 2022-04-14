# -*- coding: utf-8 -*-
x = float(input())
vetor =[x]
print('N[0] = {:.4f}'.format(x))
for i in range(1,100):
  conta = float(x/2)
  vetor += [conta] 
  print('N[{}] ='.format(i),'%.4f'%vetor[i])
  x=conta
