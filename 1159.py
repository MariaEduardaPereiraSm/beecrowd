while True:
  n = int(input())
  if n==0:
    break
  soma=0
  count=0
  par=0
  while True:
    if par>=5:
      break  
    if (n+count)%2==0:
      soma+=n+count
      par+=1
    count+=1  
  print(soma)

