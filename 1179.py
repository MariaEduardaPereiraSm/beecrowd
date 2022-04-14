par = []
impar =[]
for i in range(15):
    valor = int(input())
    if valor%2==0:
        if len(par)<5:
            par.append(valor)
        if len(par)==5:
            for x in range(len(par)):
                print('par[{}] = {}'.format(x,par[x]))  
            par = []
    else:
        if len(impar)<5:
            impar.append(valor)
        if len(impar)==5:      
            for x in range(len(impar)):
                print('impar[{}] = {}'.format(x,impar[x]))  
            impar = []
for i in range(len(impar)):
    print('impar[{}] = {}'.format(i,impar[i]))
for i in range(len(par)):
    print('par[{}] = {}'.format(i,par[i]))  

