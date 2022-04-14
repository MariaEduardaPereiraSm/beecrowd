n = int(input())
for i in range(n):
  valor = int(input())
  soma=0
  for j in range(1,valor):
    if valor%j==0:
      soma+=j
  if soma==valor:
    print(valor,'eh perfeito')
  else:
    print(valor,'nao eh perfeito')
