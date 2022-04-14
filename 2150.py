while True:
  try:
      contador =0
      vogais_alienigenas = input()
      texto = input().split()
      for i in texto:
        for j in range(len(vogais_alienigenas)):
         contador+= i.count(vogais_alienigenas[j])   
      print(contador)
  except EOFError:
    break
