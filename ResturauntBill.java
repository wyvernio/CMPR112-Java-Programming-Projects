import java.util.Scanner;

public class ResturauntBill
{
   public static void main (String[] args)      
   {
     double totalSpent;
     double totalTip;
     double fullTax;
     double withTax;
     double absoluteCost;
     double actualTip;
     
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print ("Enter the price of your meal $");
      totalSpent = keyboard.nextDouble();
      
      fullTax = totalSpent * .0675;
      
      withTax = fullTax + totalSpent;
      
      actualTip = withTax * .2;
      
      absoluteCost = actualTip + withTax;
      
      System.out.println("The total cost of your meal is $" + absoluteCost);
   }
}
      
