n = int(input())
for j in range(n):
  x = int(input())
  valor = [int(i) for i in input().split()]
  comparar = valor
  ordena= sorted(valor,reverse=True)
  cont = 0
  for i in range(x):
    if ordena[i] == comparar[i]:
      cont+=1
  print(cont)
