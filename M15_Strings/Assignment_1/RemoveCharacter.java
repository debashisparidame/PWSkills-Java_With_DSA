package PW_SKILLS.M15_Strings.Assignment_1;

/*
    4. Write a java program to remove a particular character from a String.
 */

public class RemoveCharacter 
{
    public static void main(String[] args) {
        // Define the string and the character to be removed
        String str = "Debashis Parida";
        char ch = 'a';

        // Call the removeCharacter method to remove the character from the string
        String modifiedStr = removeCharacter(str, ch);

        // Print the modified string
        System.out.println("Modified string: " + modifiedStr);
    }

    // Method to remove a particular character from a string
    public static String removeCharacter(String str, char ch) {
        // Create an empty StringBuilder
        StringBuilder modified = new StringBuilder();

        // Iterate over the characters in the string
        for (char currentChar : str.toCharArray()) {
            // If the current character is not the one to be removed, append it to the StringBuilder
            if (currentChar != ch) {
                modified.append(currentChar);
            }
        }

        // Convert the StringBuilder to a string and return it
        return modified.toString();
    }
}