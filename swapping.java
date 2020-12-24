class swapping
{
  static String swapFirstLastChar(String str)
  {
    String token[] = str.split(" ");
    String res = "";

    for (int i = 0; i < token.length; i++) {

      char a[] = token[i].toCharArray();
      char b = token[i].charAt(0);
      // System.out.println(a.length + " " + token[i].length());
      a[0] = a[a.length -1];
      a[a.length - 1] = b;

      for (int j = 0; j < a.length; j++) {
        res += a[j];
      }

      if(i != token.length - 1)
        res += " ";
    }
    return res;
  }
}

