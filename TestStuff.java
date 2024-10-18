public class TestStuff
{
  public static void main(String [] args)
  {
     int a = 10, b = 6, i;
    for (i = 1; i <= 2; ++i)
    {
      method1(a, b);
      method2 (a, b);
      a = a + 2;
      b = b - 1;
    }
    System.out.println (a + "  " + b );
  }
  public static void method1 (int a, int b)
  {
     int c ;
     c = a + b;
     ++ a;
     System.out.println (a + "  " + b + "  " + c) ;
  }
  public static void method2 (int a, int b)
  {
     int d ;
     d = a - b ;
     b = b +3 ;
     System.out.println (a + "  " + b + "  " + d);
  }


}
  