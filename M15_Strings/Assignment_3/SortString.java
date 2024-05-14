package PW_SKILLS.M15_Strings.Assignment_3;

/*
 * 4. WAP to sort a string Alphabetically.
 */

import java.util.Arrays;
public class SortString 
{
    public static void main(String[] args) 
    {
        String str = "ACBUIZGD";
        String sortedStr = sortString(str);
        System.out.println("Sorted String:"+sortedStr);
    }

    //Method to sort a string alphabetically
    public static String sortString(String str)
    {
        //Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Use the sort method of the Arrays class to sort the char array
        Arrays.sort(charArray);

        // Convert the sorted char array back to a string and return it
        return new String(charArray);

    }
}
