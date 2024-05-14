package PW_SKILLS.M15_Strings.Assignment_1;

/*
   2. Write a java program to know whether the given string is palindrome.
 */

public class PalindromeCheck 
{
  public static void main(String[] args) 
  {
     
     String str = "RADAR";
     boolean isPalindrome = isPalindrome(str);
     System.out.println("Is the string a palindrome? "+isPalindrome);
    
  }

  // Method to check if a string is a palindrome
  public static boolean isPalindrome(String str) 
  {
    String reversed = reverse(str);
    return str.equals(reversed);
  } 

  // Method to reverse a string
  public static String reverse(String str) 
  {
    StringBuilder reversed = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) 
    {
        reversed.append(str.charAt(i));
    }
    return reversed.toString();
  }
}