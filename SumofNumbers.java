import java.util.Scanner;

public class SumofNumbers {
  
  public static void main( String [] args ) {
    Scanner keyboard = new Scanner (System.in);
    
    int userNumber = -1;
    int sum = 0;
    
    while(userNumber  < 1 ) {
      System.out.println( "Please enter a positive non-zero integer" );
      userNumber = keyboard.nextInt();
        
    }
    for( int number = 1; number <= userNumber; number++ ) {
      sum = sum + number;
    }
    System.out.println( "The sum of the numnbers from 1 to " + userNumber + " is " + sum);
    

  }
}