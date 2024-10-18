public class Ch2Ex2{  
  public static void main (String [] args)  {    
  String name = "Paul Smith";    
  String  upper, lower;    
  int howMany;    
  char charAtIndex;    
  howMany = name.length();    
  upper = name.toUpperCase();    
  lower = name.toLowerCase();    
  charAtIndex = name.charAt(7);    
  
  System.out.println ("The length of the string is " + howMany + " characters.");  //10  
  System.out.println ("The string in all upper case letters is " + upper);    //PAUL SMITH
  System.out.println ("The string in all lower case letters is " + lower);    //paul smith
  System.out.println ("The character at position 7 is " + charAtIndex);    //m
  System.out.println ("The string object name is " + name);  //Paul Smith
  }
}