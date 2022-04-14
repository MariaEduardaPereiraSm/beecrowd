texto = input()
linhas = texto.splitlines()
for i in range(len(linhas)):
  tamanhoc = len(linhas[i])
  if tamanhoc<=80:
    print('YES')
  else:
    print('NO')
