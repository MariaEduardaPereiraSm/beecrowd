x,y = input().split()
x = int(x)
y = int(y)

if y%x == 0:
    print("Sao Multiplos")
elif x%y ==0:
  print("Sao Multiplos")
elif x%y or y%x !=0:
    print("Nao sao Multiplos")

