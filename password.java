import java.util.Scanner;

class password {
  public static void check(String a) {
    if (a.length() < 6)
      System.out.println("Too short!");

    else if (a.indexOf("1") == -1 && a.indexOf("2") == -1 && a.indexOf("3") == -1 && a.indexOf("4") == -1 && a.indexOf("5") == -1 && a.indexOf("6") == -1 && a.indexOf("7") == -1 && a.indexOf("8") == -1 && a.indexOf("9") == -1 && a.indexOf("0") == -1)
      System.out.println("No digit!");

    else
      System.out.println("Correct");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String b = sc.next();
    String a = sc.next();
    check(a);

    sc.close();
  }
}