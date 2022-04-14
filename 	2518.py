# -*- coding: utf-8 -*-
import math

while True:
  try:
    N = int(input())
    H,C,L = input().split(' ')
    H = int(H)
    C = int(C)
    L = int(L)
    calculo = (H*H) + (C*C)
    C2 = math.sqrt(calculo)
    c3= (C2*N)*L
    x = c3/10000
    print("%.4f" %x)
  except EOFError:
        break
