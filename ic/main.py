n=0
t1=1 
t2=2
p=0
m=0
pe=0
me=0
tam="?"
i=0
print(type(n))
n = int(input('quantidade de vencedores: '))
for i in range(n):
  i+=1
  tam = input('escreva seu tamanho P ou M ')
  if tam=='P': 
   print(t1)
   pe+=1
  elif tam=='M':
    print(t2)
    me+=1
p = int(input('quantidade de camisas P:  '))
m = int(input('quantidade de camisas M: '))
if pe==p and me==m:
  print('S')
else:
  print('N')


