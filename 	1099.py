# -*- coding: utf-8 -*-
n = int(input())
soma=0
for i in range(n):
  x, y = input().split(" ")
  x = int(x)
  y = int(y)
  if(x<y):
   for t in range(x+1,y):
     if t%2!=0:
      soma+=t
   print(soma)
   soma=0
  if(x>y):
     for u in range(y+1,x):
      if u%2!=0:
       soma+=u
     print(soma)
     soma=0
  if x==y:
     soma=0
     print(soma)
