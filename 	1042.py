import math
x,y,z = input().split()
x = int(x)
y = int(y)
z = int(z)
mi = min(x,y,z)
if mi==x:
    min2 = min(y,z)
    maior = max(y,z)
if mi==y:
    min2 = min(x,z)
    maior = max(x,z)
if mi==z:
    min2 = min(x,y)
    maior = max(x,y)

print(mi)
print(min2)
print(maior)
print()
print(x)
print(y)
print(z)

