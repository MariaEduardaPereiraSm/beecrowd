positivo=0
negativo =0
par=0
impar=0
for i in range(5):
  valor = int(input())
  if valor<0:
    negativo+=1
  if valor>0:
    positivo+=1
  if valor%2==0:
    par+=1
  else:
      impar+=1

print(par,'valor(es) par(es)')
print(impar,'valor(es) impar(es)')
print(positivo,'valor(es) positivo(s)')
print(negativo,'valor(es) negativo(s)')

