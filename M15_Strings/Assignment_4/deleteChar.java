package PW_SKILLS.M15_Strings.Assignment_4;

import java.util.Scanner;

/*
    7. Write a program to delete all consonants from the string "Hello,have a good day". (Take input from user)
 */

public class deleteChar 
{
  public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Please enter a string: ");

     String str = sc.nextLine();

     String result = str.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");

     System.out.println("The string without consonants is: "+result);

     sc.close();
  }   
}
