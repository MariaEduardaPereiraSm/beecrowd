# -*- coding: utf-8 -*-
R,L = input().split(' ')
R = int(R)
L = int(L)
volume = (4/3) * 3.1415 * (R**3)
volume = float(volume)
valor = int(L/volume)
print(valor)


