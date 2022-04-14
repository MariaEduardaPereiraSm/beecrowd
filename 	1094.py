valor = int(input())
r =0
s=0
c=0
total =0
for i in range(valor):
  numero, tipo = input().split(' ')
  numero= int(numero)
  tipo = str(tipo)
  total+=numero 
  if(tipo=='C'):
    c+=numero
  if(tipo=='R'):
    r+=numero
  if(tipo=='S'):
    s+=numero

print('Total:',total,'cobaias')
print('Total de coelhos:',c)
print('Total de ratos:',r)
print('Total de sapos:',s)
pc = (c*100)/total
pr = (r*100)/total
ps = (s*100)/total
print('Percentual de coelhos: {:.2f} %'.format(pc))
print('Percentual de ratos: {:.2f} %'.format(pr))
print('Percentual de sapos: {:.2f} %'.format(ps))
