a,b,c = input().split(" ")
a = int(a)
b= int(b)
c= int(c)
maior = int(((a+b) + abs(a-b))/2)
if c > maior:
  print(c,'eh o maior')
else:
  print(maior,'eh o maior')

