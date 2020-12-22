import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    int p,n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(p=0;p<n;p++)
    {
      int a,b,c,d,i,j,sum=0,m;
    a=s.nextInt();
    b=s.nextInt();    
    int m1[][]=new int[a][b];
      for(i=0;i<a;i++)
      {
        for(j=0;j<b;j++)
        {
          m1[i][j]=s.nextInt();
        }
      }
    c=s.nextInt();
    d=s.nextInt();    
    int m2[][]=new int[c][d];
      for(i=0;i<c;i++)
      {
        for(j=0;j<d;j++)
        {
          m2[i][j]=s.nextInt();
        }
      }
      int mul[][]=new int[a][d];
      for(i=0;i<a;i++)
      {
        for(j=0;j<d;j++)
        {
          for(m=0;m<b;m++)
          {
            sum=sum+m1[i][m]*m2[m][j];
          }
          mul[i][j]=sum;
          sum=0;
        }
      }
      for(i=0;i<a;i++)
      {
        for(j=0;j<d;j++)
        {
          System.out.print(mul[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
}

