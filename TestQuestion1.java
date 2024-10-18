public class PreandPost
{
  public static void main(String[] args)
  {
    int a = 3, b = 5, c = 0;
    
      c = b + ++a;
      System.out.println (a +"  " + c);
      a = 3;
      c = 0;
      c = b + a++;
      System.out.println(a + "  "+ c);
      a = 3;
      c = 0;
      c = b + a--;
      System.out.println(a + "  " + c);
      a = 3;
      c = 0;
      c = b + --a;
      System.out.println (a + "  " + c);
    System.out.println(" ALL DONE");
  }
}
