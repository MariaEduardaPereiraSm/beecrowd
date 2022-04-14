operacao = input()
matriz =[]
for i in range(12):
    linha =[]
    for j in range(12):
      linha.append(float(input()))
    matriz.append(linha)
soma=0
for i in range(12):
    for j in range(12):
        if i<j:
            soma+=matriz[i][j]
if operacao=='S':
    print('{:.1f}'.format(soma))
elif operacao=='M':
    print('{:.1f}'.format(soma/(66)))

