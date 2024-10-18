import java.util.Scanner;

public class SoftwareSales {
  
  public static void main( String [] args ) {
    
    double packagesBought;
    double totalBought;
    double bigDiscount;
    double properTotal;
    double itemPrice;
    
    Scanner keyboard = new Scanner (System.in);
    
    System.out.print("How many packages did you buy?");
    packagesBought = keyboard.nextDouble();
    itemPrice = 99;
    
   if (packagesBought < 10)
   {
         System.out.println ("You have no discount, sorry. :<");
   totalBought = packagesBought * itemPrice;
    System.out.println ("Your total is " + totalBought);     
   }
      else if (packagesBought < 19)
      {
         System.out.println ("Your packages are 20% off!");
      totalBought = packagesBought * itemPrice;
       bigDiscount = totalBought * .2;
      properTotal = totalBought - bigDiscount ;
      System.out.println ("Your total is " + properTotal);
      }
      
      else if (packagesBought < 49)
      {
         System.out.println ("Your packages are 30% off!");
      totalBought = packagesBought * itemPrice;
       bigDiscount = totalBought * .3;
      properTotal = totalBought - bigDiscount ;
      System.out.println ("Your total is " + properTotal);
      }
      
      else if (packagesBought < 99)
      {
         System.out.println ("Your packages are 40% off!");
      totalBought = packagesBought * itemPrice;
       bigDiscount = totalBought * .4;
      properTotal = totalBought - bigDiscount ;
      System.out.println ("Your total is " + properTotal);
      }
      
      else
      {
         System.out.println ("Your packages are 50% off!");
      totalBought = packagesBought * itemPrice;
       bigDiscount = totalBought * .5;
      properTotal = totalBought - bigDiscount ;
      System.out.println ("Your total is " + properTotal);
      }

  }
}