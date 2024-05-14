package PW_SKILLS.M15_Strings.Assignment_4;

/*
    6. Write a program to check if the letter 'e' is present in the word "Umbrella".
 */

public class FindLetter 
{
    public static void main(String[] args) 
    {
       String str = "Umbrella";
       
       boolean containsE = str.contains("e");

       if(containsE)
       {
        System.out.println("The word 'Umbrella' contains the letter 'e'");
       }
       else
       {
        System.out.println("The word 'Umbrella' does not contain the letter 'e'");
       }
    }
}
