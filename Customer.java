
class Customer
{
  private int id;
  private String name;
  private char gender;
  Customer(int id,String name,char gender)
  {
    this.id=id;
    this.name=name;
    this.gender=gender;
  }
  public int getID()
  {
    return id;
  }
  public String getName()
  {
    return name;
  }
  public char getGender()
  {
    return gender;
  }
  public  String toString()
  {
    return (getName()+"("+getID()+")");
  }
  
}

class BankAccount
{
  private int id;
  private Customer customer;
  private double balance;
  BankAccount(int id,Customer customer,double balance)
  {
    this.id=id;
    this.customer=customer;
    this.balance=balance;
  }
  public int getID()
  {
    return id;
  }
  public Customer getCustomer()
  {
    return customer;
  }
  public double getBalance()
  {
    return balance;
  }
  public void setBalance(double b)
  {
    balance=b;
  }
  public String toString()
  {
    return String.format(customer.getName()+"("+customer.getID()+")"+" balance=INR "+getBalance()+"0");
  }
  public void deposit(double amt)
  {
    balance+=amt;
  }
  public void withdraw(double amt)
  {
    if(balance-amt<0)
      System.out.println("Insufficient balance");
    else
      balance-=amt;
  }
}