import java.util.Scanner;

public class BookClubPoints {
  
  public static void main( String [] args ) {
    
    int booksPurchased;
    
    
    Scanner keyboard = new Scanner (System.in);
    
    System.out.print("How many books have you purchased this month?");
    booksPurchased = keyboard.nextInt();
         
    switch (booksPurchased)
      {
         case 0:
            System.out.println("You bought 0 books!");
            System.out.println("You have been awarded 0 points!");
            break;
        
         case 1:
            System.out.println("You bought 1 book!");
            System.out.println("You have been awarded 5 points!");
            break;
         case 2:
            System.out.println("You bought 2 books!");
            System.out.println("You have been awarded 15 points!");
            break;
         case 3:
            System.out.println("You bought 3 books!");
            System.out.println("You have been awarded 30 points!");
            break;
         case 4:
           System.out.println("You bought 4 books!");
           System.out.println("You have been awarded 60 points!");
           break;
        
         default:
            System.out.println("You bought more than 4 books!");
            System.out.println("You have been awarded 60 points!");
            break;
      }
   }
}