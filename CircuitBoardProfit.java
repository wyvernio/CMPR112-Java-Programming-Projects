import java.util.Scanner;

public class CircuitBoardProfit
{
   public static void main (String[] args)      
   {
     double retailPrice;
     double maxProfit;
     
       Scanner keyboard = new Scanner (System.in);
       
       System.out.print ("Enter the retail price of the item ");
      retailPrice = keyboard.nextDouble();
      
      maxProfit = retailPrice * .4;
      System.out.println("Your amount of profit is $" + maxProfit);
   }
}
      
      

