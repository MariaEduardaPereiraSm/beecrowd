# -*- coding: utf-8 -*-
m = int(input())
a = int(input())
b = int(input())
maior =0
if m>=40 and m<=110:
  if b>=1 and b<m:
   if a>=1 and a<m:
    if a!=b:
      if a>b:
        maior = a
        f3 = m - (a+b)
        if a>f3:
          print(a)
        else:
          print(f3)
      else:
        maior =b
        f3 = m - (a+b)
        if b>f3:
          print(b)
        else:
          print(f3)
  
  
