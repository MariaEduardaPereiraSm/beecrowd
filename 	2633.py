while True:
  try:
    cont=0
    n = int(input())
    armazenar ={}
    for i in range(n):
      carne, validade = input().split()
      armazenar[carne] = int(validade)
    for i in sorted(armazenar, key= armazenar.get):
      cont+=1
      if cont==len(armazenar):
       print(i, end='')
      else:
       print(i, end=' ')
    print()
  except EOFError:
    break
