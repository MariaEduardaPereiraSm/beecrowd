n = int(input())
for i in range(n):
  texto = input()
  texto = texto.split()
  ordena = sorted(texto, key=len, reverse=True)
  print(*ordena)
