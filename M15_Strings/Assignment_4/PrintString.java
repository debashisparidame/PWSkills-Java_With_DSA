package PW_SKILLS.M15_Strings.Assignment_4;

/*
    1. Write a program to print a string entered by the user.
 */
import java.util.*;
public class PrintString 
{
      public static void main(String[] args) 
      {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Please enter a string: ");

         String str = sc.nextLine();

         System.out.println("You entered: "+str);

         sc.close();
      }
}
