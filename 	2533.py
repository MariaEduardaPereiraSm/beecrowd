while True:
  try:
    s=0
    ira=0
    M = int(input())
    for i in range(M):
     nota, carga_horaria = [int(i) for i in input().split()]
     ira += (nota*carga_horaria)
     s+= carga_horaria
    ss = ira/(s*100)
    print('{:.4f}'.format(ss))
  except EOFError:
    break
