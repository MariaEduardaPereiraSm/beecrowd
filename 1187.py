operacao = input()
matriz=[]
for i in range(12):
    linhas =[]
    for j in range(12):
        linhas.append(float(input()))
    matriz.append(linhas)
soma=0
for i in range(12):
    for j in range(12):
        if j>i and j<((12-i)-1):
            soma += matriz[i][j]
if operacao=='S':
 print('{:.1f}'.format(soma))
elif operacao=='M':
    print('{:.1f}'.format(soma/30))
