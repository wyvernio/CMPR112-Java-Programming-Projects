import java.util.Scanner;

public class InternetServiceProvider {
  
  public static void main( String [] args ) {
    
    double internetPackage;
    double hoursExceeded = 0;
    double aHourLimit = 10;
    double bHourLimit = 20;
    double aBasePrice = 9.95;
    double bBasePrice = 13.95;
    double cBasePrice = 19.95;
    double bExtraFee = 1;
    double aExtraFee = 2;
    double internetHours;
    double extraCharge = 0;
    double totalPrice = 0;
     
       
      Scanner keyboard = new Scanner(System.in);
      
      
      System.out.print("Enter A, B, or C for whichever Internet package you bought! ");
      internetPackage = keyboard.nextDouble();
      
      System.out.print("Enter the number of hours you spent on the internet");
      internetHours = keyboard.nextDouble();

      if(internetPackage.equalsIgnorCase("a") ) {
        if( internetHours > aHourLimit) {
          hoursExceeded = internetHours - aHourLimit;
          extraCharge = hoursExceeded * aExtraFee;
          
        }
        totalPrice = aBasePrice + extraCharge;
      } else if( internetPackage.equalsIgnorCase("b") ) {
         if( internetHours > bHourLimit) {
          hoursExceeded = internetHours - bHourLimit;
          extraCharge = hoursExceeded * bExtraFee;
   }
         totalPrice = bBaseProce + extraCharge;
      } else if( internetPackage.equalsIgnorCase("c") ) {
         totalPrice = cBasePrice;
  }
      System.out.println ("You chose Package %s\nHours Exceeded:%d\n Extra charge: %f\nTotal charge: %f", internetPackage, hoursExceeded, extraCharge, totalBill);
  }
}
    