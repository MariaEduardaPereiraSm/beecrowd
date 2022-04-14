valor = float(input())
notas= [100, 50, 20, 10, 5, 2]
moedas =[1.0, 0.50, 0.25,0.1, 0.05, 0.01]

print("NOTAS:")
for nota in notas:
    conta = int(valor/nota)
    valor -= conta * nota
    print('{} nota(s) de R$ {:.2f}'.format(conta,nota))
print("MOEDAS:")
for moeda in moedas:
    valor = round(valor, 2)
    c = int(valor/moeda)
    valor -= c* moeda
    print('{} moeda(s) de R$ {:.2f}'.format(c,moeda))

