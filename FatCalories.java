import java.util.Scanner;

public class FatCalories {
  
  public static void main( String [] args ) {
    
    double userCalories;
    double userFat;
    double fatCalories;
    double fatPercent;
    double caloriePercent;
    
    
    Scanner keyboard = new Scanner (System.in);
    
    System.out.print("Enter the number of calories in your item!");
    userCalories = keyboard.nextDouble();
    
    System.out.print("Enter the number of fat grams!");
    userFat = keyboard.nextDouble();
    
    fatCalories = userFat * 9;
    
    fatPercent = fatCalories / userCalories;
    
    caloriePercent = .3 * userCalories;
    

    

    
    if ( fatPercent <= caloriePercent )
      {
         System.out.println("This food is low in fat!");
        
      }
      else
      {
        System.out.println("This food is high in fat!");
      }
                    
                               
                     
    
  }
}