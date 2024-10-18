import java.util.Scanner;

public class SalesTax
{
  public static void main (String[] args)
  {
    double absoluteTotal;
    double completeTax;
    double totalPrice2;
    double totalPrice;
    double countyTotal;
    double stateTotal;
    double amountPurchased;
    double stateTax = .04;
    double countyTax = .02;
    
    Scanner keyboard = new Scanner (System.in);
      
    System.out.print("Enter the amount of purchase");
    amountPurchased = keyboard.nextDouble();
    
    stateTotal = (amountPurchased * stateTax);
    countyTotal = (amountPurchased * countyTax);
     
    totalPrice = (amountPurchased + stateTotal);
    totalPrice2 =(amountPurchased + countyTotal);
    completeTax = (stateTotal + countyTotal);
    absoluteTotal =(amountPurchased + completeTax);
    
    System.out.println("Your purchase was $" + amountPurchased);
    System.out.println("The county tax is $" + countyTax);
    System.out.println("The state tax is $" + stateTax);
    System.out.println("Your total is now $" + absoluteTotal);
  }
}
    
    
    
