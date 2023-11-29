import java.util.Scanner;

class Main {
  

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int t1=1,t2=2;
    int P=0,M=0;
    int pe=0,me=0;
        System.out.print("Digite a quantidade de ganhadores: ");
    int N = reader.nextInt();
    for(int i=0;i<N;i++){
      System.out.print("Digite o tamano da camisa P ou M ");
    char tam = reader.next().charAt(0);
      switch (tam){
        case 'P':
          System.out.println(" " + t1);
          pe++;
          break;
        case 'M':
          System.out.println(" " + t2);
          me++;
          break;
        default:
          System.out.println("Valor Incorreto ");
          
      }
      
    }
      System.out.print("Digite a quantidade de camisas P:  ");
     P = reader.nextInt();
    System.out.print("Digite a quantidade de camisas M:  ");
     M = reader.nextInt();
    if(pe==P && me==M){
      System.out.print("S");
    }else{
      System.out.print("N");
    }

    
  }
}