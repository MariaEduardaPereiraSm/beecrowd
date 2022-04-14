x, y= input().split(" ")
x = float(x)
y = float(y)

if x == 0.0 and y == 0.0:
  print('Origem')
elif y>0.0 and x>0.0:
  print('Q1')
elif y>0.0 and x<0.0:
  print('Q2')
elif y<0.0 and x>0.0:
  print('Q4')
elif y<0.0 and x<0.0:
  print('Q3')
elif x== 0.0 and y>0.0 or y<0.0:
  print('Eixo Y')
elif y== 0.0 and x>0.0 or x<0.0:
  print('Eixo X')
