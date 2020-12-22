import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    
    Scanner s=new Scanner(System.in);
    int i,sum=0;
    int a[]=new int[10];
    for(i=0;i<10;i++)
    {
      a[i]=s.nextInt();
      sum=sum+a[i];
    }
    
    System.out.println(sum);
  }
}