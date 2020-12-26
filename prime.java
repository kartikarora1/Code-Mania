import java.util.Scanner;

class prime
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int flag, count = 0;
      
      escape:
      for(int i = 2; i <= a ; i++){
        flag = 0;
        for(int j = 2 ; j <= i/2 ; j++){
          if(i % j == 0)
            flag++;
        }
        if(flag == 0){
          System.out.println(i);
          count++;
        }
        if(count == b)
          break escape;
      }
      
    }
}