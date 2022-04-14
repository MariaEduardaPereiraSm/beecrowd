valor1 = input().split(' ')
valor2 = input().split(' ')
for i in range(len(valor1)):
    if valor1[i]==valor2[i]:
         print('N')
         break   
else:
    print('Y')
