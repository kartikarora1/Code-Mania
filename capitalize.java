static String capitalize(String str)
{
	String token[] = str.split(" ");
  	String a = "";
  	for(int i = 0; i < token.length; i++){
      
      a += token[i].toUpperCase().charAt(0);
      a += token[i].substring(1);
      
      if(i != token.length - 1)
        a += " ";
    }
  
  return a;
}
