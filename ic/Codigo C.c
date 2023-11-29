#include <stdio.h>

int main(void) {
  int n=0;
  int t1=1,t2=2;
  int P=0, M=0;
  int pe=0,me=0;
  char tam;
  printf("digite a quantidade de premiados\n");
  scanf("%d",&n);
  for(int i=0;i<n;i++){
  printf("Tamanho da camisa P ou M \n");
    scanf(" %c",&tam);
    switch (tam){
      case 'P':
      printf("%d\n",t1);
      pe++;
        break;
      case 'M':
      printf("%d\n",t2);
      me++;
      break;
    }
  }
  printf("quantidade de camisas P: ");
  scanf("%d",&P );
  printf("quantidade de camisas M: ");
  scanf("%d",&M);
  if(pe==P && me==M)
    printf("S");
  else
    printf("N");
}