codigo, quantidade = input().split()
codigo = int(codigo)
quantidade = int(quantidade)
if codigo ==1:
    valor = quantidade*4.00
if codigo ==2:
  valor = quantidade*4.50
if codigo ==3:
  valor = quantidade*5.00
if codigo ==4:
  valor = quantidade*2.00
if codigo ==5:
  valor = quantidade*1.50
print("Total: R$ %.2f"%valor)
