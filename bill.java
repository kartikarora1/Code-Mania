class Bill
{
  Scanner sc = new Scanner(System.in);
  
  int price = sc.nextInt();
  int quan = sc.nextInt();
  
  int price(){
      return price;
    }
  	
  int quan(){
      return quan;
    }
}

class Cash extends Bill
{
	int n2g = sc.nextInt();
    int n5 = sc.nextInt();
    int n1 = sc.nextInt();
    int n50 = sc.nextInt();
    int n10 = sc.nextInt();
    int total, cash;
    
 void get_cash()
 {
 	total = price() * quan();
    cash = (n2g * 2000 + n5 * 500 + n1 * 100 + n50 * 50 + n10 * 10);
 }
 void display()
 {
 	if(total > cash)
    	System.out.println("Need to pay: " + (total-cash));
    else
    	System.out.println("Clear");
    
 }
}
