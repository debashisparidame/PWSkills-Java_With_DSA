package PW_SKILLS.M15_Strings.Assignment_3;

/*
    2. WAP to reverse a String

       Input: "PWSKILLS"
       Output: "SLLIKSPW"
 */

import java.lang.StringBuilder;

public class ReverseString {
    public static void main(String[] args) 
    {
        String str = "PWSKILLS";

        // Call the reverseString method to reverse the string
        String reversedStr = reverseString(str);

        // Print the reversed string
        System.out.println("Reversed string: " + reversedStr);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        // Create a new StringBuilder with the string
        StringBuilder sb = new StringBuilder(str);

        // Use the reverse method of the StringBuilder class to reverse the string
        sb.reverse();

        // Convert the StringBuilder back to a string and return it
        return sb.toString();
    }
}