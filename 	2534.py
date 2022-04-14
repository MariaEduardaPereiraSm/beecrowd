while True:
  try:
     numero_habitantes, numero_consultas = [int(i) for i in input().split()]
     lista=[]
     for i in range(numero_habitantes):
       notas = int(input())
       lista.append(notas)
     lista = sorted(lista, reverse=True)
     for j in range(numero_consultas):
       consultas = int(input())
       print(lista[consultas-1])
  except EOFError:
     break

