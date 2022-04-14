horai=0
minutoi=0
horaf=0
minutof=0

horai, minutoi, horaf, minutof = input().split(" ")
horai= int(horai)
minutoi= int(minutoi)
horaf= int(horaf)
minutof= int(minutof)

ht= horaf - horai
mt = minutof - minutoi

if ht == 0 and mt == 0:
  ht += 24

if mt < 0:
 ht-=1
 mt += 60

if ht <0:
  ht += 24
    
print('O JOGO DUROU {} HORA(S) E {} MINUTO(S)'.format(ht, mt))
 
