N = int(input())
for i in range(N):
  b,e = [int(i) for i in input().split()]
  lista =[]
  for j in range(b,e+1):
    print(j,end='')
  for j in range(e,b-1,-1):
    x = str(j)
    x = x[::-1]
    print(x,end='')
  print()

