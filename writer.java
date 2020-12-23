
class Writer
{
  private String name;
  private String email;
  private char gender;
  Writer(String name,String email,char gender)
  {
    this.name=name;
    this.email=email;
    this.gender=gender;
  }
  public String getName()
  {
    return name;
  }
  public String getEmail()
  {
    return email;
  }
  public char getGender()
  {
    return gender;
  }
  public void setEmail()
  {
    this.email=email;
  }
  public String toString()
  {
    return String.format("Writer[name=" + getName() +",email=" + getEmail() +",gender=" + getGender() +"]");
  }
}

class Book
{
  private String name;
  private Writer writer;
  private double price;
  private int qty;
  public Book (String name, Writer writer, double price, int qty) 
  { this.name=name;
    this.writer=writer;
   this.price=price;
   this.qty=qty;
  }
  public String getName()
  {
    return name;
  }
    public double getPrice()
  {
    return price;
  } 
   public int getQty()
  {
    return qty;
  }
  public void setPrice(double price)
  {
    this.price=price;
  }
  public void setQty(int qty)
  {
    this.qty=qty;
  }
  public String toString(){
    return String.format("Book[name=" + getName() +"," + writer.toString() +",price=" + getPrice() +",qty=" + getQty());
  }
}