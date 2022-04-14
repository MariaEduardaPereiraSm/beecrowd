x = int(input())
n100 = int(x/100)
r100 = x%100

n50 = int(r100/50)
r50 = r100%50

n20 = int(r50/20)
r20 = r50%20

n10 = int(r20/10)
r10 = r20%10

n5 = int(r10/5)
r5 = r10%5

n2 = int(r5/2)
r2 = r5%2


print(x)
print(n100,'nota(s) de R$ 100,00')
print(n50,'nota(s) de R$ 50,00')
print(n20,'nota(s) de R$ 20,00')
print(n10,'nota(s) de R$ 10,00')
print(n5,'nota(s) de R$ 5,00')
print(n2,'nota(s) de R$ 2,00')
print(r2,'nota(s) de R$ 1,00')
