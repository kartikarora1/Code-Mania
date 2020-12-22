import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    while(n!=0){
      int a=sc.nextInt();
      int b[][]=new int[a][a];
      for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){
          b[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<a/2;i++){
      for(int j=i;j<a-1-i;j++){
        int tmp=b[i][j];
        b[i][j]=b[a-1-j][i];
        b[a-1-j][i]=b[a-1-i][a-1-j];
        b[a-1-i][a-1-j]=b[j][a-1-i];
        b[j][a-1-i]=tmp;
      }
    }
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
        if(j==a-1)  System.out.println(b[i][j]);
        else System.out.print(b[i][j]+" ");
      }
    }
    System.out.println();
    n--;
    }
  }
}