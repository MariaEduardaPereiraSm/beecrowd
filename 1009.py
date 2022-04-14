# -*- coding: utf-8 -*-

nome = str(input(""))
sf = float(input(""))
tv = float(input(""))
comissao = 0.15*tv
salario = sf +comissao

print('TOTAL = R$ {:.2f}'.format(salario))
