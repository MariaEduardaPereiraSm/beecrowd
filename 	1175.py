vetor = []
for i in range(20):
    vetor.append(int(input()))
for i in range(10):
    x = vetor[i] 
    y = vetor[19-i]
    vetor[i] = y
    vetor[19-i]=x
for i in range(len(vetor)):
    print('N[{}] = {}'.format(i, vetor[i]))
