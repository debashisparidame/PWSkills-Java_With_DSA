package PW_SKILLS.M15_Strings.Assignment_1;

/*
    5. Write a java program to find the index of a substring.
 */

public class SubstringIndex 
{
    public static void main(String[] args) {
        // Define the string and the substring
        String str = "Debashis Parida";
        String substr = "Parida";

        // Call the findSubstringIndex method to find the index of the substring in the string
        int index = findSubstringIndex(str, substr);

        // Print the index
        System.out.println("The index of the substring is: " + index);
    }

    // Method to find the index of a substring in a string
    public static int findSubstringIndex(String str, String substr) {
        // Use the indexOf method of the String class to find the index of the substring
        return str.indexOf(substr);
    }
}
