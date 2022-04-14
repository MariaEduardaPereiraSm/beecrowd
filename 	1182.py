coluna = int(input())
operacao = input()
matriz = []
for i in range(12):
    linha=[]
    for j in range(12):
        linha.append(float(input()))
    matriz.append(linha)
soma =0
for i in range(12):
    soma += matriz[i][coluna]
if operacao=='S':
    print('{:.1f}'.format(soma))
elif operacao=='M':
    print('{:.1f}'.format(soma/12))

