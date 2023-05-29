/*
Copy and run the following program. Explain how the program 
compares the two strings. How can you modify the program so that 
str2 and str3 are equal when they are compared?
*/

public class Lab6
{
   public static void main(String[] args)
   {
      String str1 = "abcd";
      String str2 = "abcdefg";
      String str3 = str1 + "efg";
      System.out.println("str2 = " + str2);
      System.out.println("str3 = " + str3);
      if (str2.equals(str3))//(str2 == str3) to compare location of strings, not their contents.
      {
         System.out.println("The strings are equal");
      }
      else
      {
         System.out.println("The strings are not equal");
      }
   }
}
//This program uses the equal operator to compare str1 && str2 by using "if" && "else" statement.