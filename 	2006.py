rc = int(input())
cont =0
exemplo = input().split()
exemplo = list(map(int, exemplo))
for i in range(len(exemplo)):
  if exemplo[i] == rc:
    cont+=1
print(cont)
