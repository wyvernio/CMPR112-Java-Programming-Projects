import java.util.Scanner;

public class Wages
{
   public static void main (String[] args)      
   {
      double hoursWorked;
      double basePay = 25;  
      double overtimeHours;
      double totalWages;   
   
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print ("Enter the total hours worked ");
      hoursWorked = keyboard.nextDouble();
      
      overtimeHours = (hoursWorked - 40);
      totalWages =(basePay * 40) + overtimeHours * (1.5 * basePay);
            
      System.out.println("Wages for this week are $" + totalWages);
   }
} 