vetor = []
valor = int(input())
for i in range(0,1000,valor):
    for j in range(0, valor):
        if len(vetor)==1000:
            break
        vetor.append(j)
for i in range(len(vetor)):
    print('N[{}] = {}'.format(i, vetor[i]))
