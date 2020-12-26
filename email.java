import java.util.Scanner;

class email
{
  public static void check(String a){
    int at = a.indexOf("@");
    int dot = a.indexOf(".");

    if(at > dot || at == -1 || dot == -1)
      System.out.println("Invalid");
    else
      System.out.println("Valid");
  }
  
  public static void main(String[] args)
  {
    String id;
    Scanner s1 = new Scanner(System.in);
    id = s1.nextLine();
    try{
      check(id);
    }
    catch(Exception e){}
    
    s1.close();
  }
}