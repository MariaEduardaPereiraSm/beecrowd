n = int(input())
led=0
for i in range(n):
  x = str(input())
  tamanho = len(x)
  for j in range(tamanho):
    if x[j] =='0':
      led+=6
    elif x[j] =='1':
      led+=2
    elif x[j] =='2':
      led+=5
    elif x[j] =='3':
      led+=5
    elif x[j] =='4':
      led+=4
    elif x[j] =='5':
      led+=5
    elif x[j] =='6':
      led+=6
    elif x[j] =='7':
      led+=3
    elif x[j] =='8':
      led+=7
    elif x[j] =='9':
      led+=6
  print(led, 'leds')
  led=0




