n= int(input())
alfabeto = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
for i in range(n):
   codigo = input()
   deslocamento = int(input())
   for j in codigo:
     nova_posicao =  alfabeto.index(j) - deslocamento
     j=alfabeto[nova_posicao]
     print(j,end='')
   print()
