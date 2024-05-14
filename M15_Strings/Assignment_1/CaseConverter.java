package PW_SKILLS.M15_Strings.Assignment_1;

/*
    3. Write a java program to convert upper case to lower case and vice versa.
 */

public class CaseConverter 
{
    public static void main(String[] args) {
        // Define the string to be converted
        String str = "CODE WITH DEB";

        // Call the convertCases method to convert the cases of the characters in the string
        String convertedStr = convertCases(str);

        // Print the converted string
        System.out.println("Converted string: " + convertedStr);
    }

    // Method to convert the cases of the characters in a string
    public static String convertCases(String str) {
        // Create an empty StringBuilder
        StringBuilder converted = new StringBuilder();

        // Iterate over the characters in the string
        for (char ch : str.toCharArray()) {
            // If the character is uppercase, convert it to lowercase
            if (Character.isUpperCase(ch)) {
                converted.append(Character.toLowerCase(ch));
            } 
            // If the character is lowercase, convert it to uppercase
            else if (Character.isLowerCase(ch)) {
                converted.append(Character.toUpperCase(ch));
            } 
            // If the character is not alphabetic, leave it unchanged
            else {
                converted.append(ch);
            }
        }

        // Convert the StringBuilder to a string and return it
        return converted.toString();
    }
}