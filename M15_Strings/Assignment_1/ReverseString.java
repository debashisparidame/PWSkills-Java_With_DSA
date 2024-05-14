package PW_SKILLS.M15_Strings.Assignment_1;

/*
    1. Write a java program to Reverse a string without using the inbuilt method.
 */

public class ReverseString 
{
    public static void main(String[] args) 
    {
          String str = "Debashis Parida";
          String reversedStr = reverse(str);
          System.out.println("Reversed string: "+reversedStr);      
    }

    public static String reverse(String str)
    {
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
