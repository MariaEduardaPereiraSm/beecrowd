# -*- coding: utf-8 -*-

linha1 = input().split(" ")
linha2 = input().split(" ")

C1, N1, V1 = linha1
C2, N2, V2 = linha2

conta1 = int(N1) * float(V1) + int(N2) * float(V2)

print('VALOR A PAGAR: R$ %.2f'%conta1)
