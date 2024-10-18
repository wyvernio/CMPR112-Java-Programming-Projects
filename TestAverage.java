import java.util.Scanner;
public class TestAverage
{
public static void main (String[] args)
{

double firstScore;
double secondScore;
double thirdScore;
double averageScore;
double allScore;
int threeNumber;

Scanner keyboard = new Scanner (System.in);

System.out.println("What was your first score?");
firstScore = keyboard.nextDouble();

System.out.println("What was your second score?");
secondScore = keyboard.nextInt();

System.out.println("What is your third score?");
thirdScore = keyboard.nextInt();

allScore = firstScore + secondScore + thirdScore;

averageScore = allScore / 3;
System.out.println("Here is yor first score! " + firstScore);
System.out.println("Here is your second score! " + secondScore);
System.out.println("Here is your third score! " + thirdScore);
System.out.println("Here is your score average! " + averageScore);
}
}
