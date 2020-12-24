static int palindromestring(String str)
{
  String token[] = str.split(" ");
  int count = 0;
  
  for(int i = 0; i < token.length; i++){
    
    StringBuffer a = new StringBuffer(token[i]);
    a.reverse();
    String b = a.toString().toLowerCase();

    if(token[i].toLowerCase().equals(b))
      count++;
  }
  
  return count;
  
}
