N = int(input())
for i in range(N):
  palavra = input()
  tamanho = len(palavra)
  meio = int(tamanho/2)
  p1 = palavra[:meio]
  p1 =p1[::-1]
  p2 = palavra[meio:]
  p2 = p2[::-1]
  print(p1+p2)
