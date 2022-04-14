# -*- coding: utf-8 -*-
n =1
m =1
cont=0
while n<=0 or m<=0 or n!=0 or m!=0:
 n,m = input().split(" ")
 n= int(n)
 m= int(m)
 if n ==0 or m == 0 or n<=0 or m<=0:
   break;
 else:
  if(n>m):
   for i in range(m,n+1):
    cont+=i
    print(i,"",end="")
   print('Sum={}'.format(cont))
   cont=0
  else:
   for i in range(n,m+1):
     cont+=i
     print(i,"",end="")
   print('Sum={}'.format(cont))
   cont=0

