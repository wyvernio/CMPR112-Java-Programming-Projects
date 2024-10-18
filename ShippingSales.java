import java.util.Scanner;

public class ShippingSales {
  
  public static void main( String [] args ) {
    
    double packageWeight;
    
    double properTotal;
    
    
    Scanner keyboard = new Scanner (System.in);
    
    System.out.print("Enter the weight of the package!");
    packageWeight = keyboard.nextDouble();

    
   if (packageWeight <= 2)
   {
         System.out.println ("The weight of your package is " + packageWeight);
         
         properTotal = packageWeight * 1.1;
   
    System.out.println ("Your total is $" + properTotal);     
   }
      else if (packageWeight > 2 || packageWeight < 6)
      {
         System.out.println ("The weight of your package is " + packageWeight);
         properTotal = packageWeight * 2.2;
         
     
      System.out.println ("Your total is $" + properTotal);
      }
      
      else if (packageWeight > 6 || packageWeight < 10)
      {
         System.out.println ("The weight of your package is " + packageWeight);
         properTotal = packageWeight * 3.7;
      
         
      System.out.println ("Your total is $" + properTotal);
      }
      
      
      else
      {
         System.out.println ("The weight of your package is " + packageWeight);
    properTotal = packageWeight * 3.8;
         
      System.out.println ("Your total is $" + properTotal);
      }

  }
}