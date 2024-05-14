package PW_SKILLS.M15_Strings.Assignment_3;

/*
    3. WAP to reverse a sentence while preseving the position

         Input: "Think Twice"
         Output: "knihT eciwT"
 */


public class SentenceReverse 
{
    public static void main(String[] args) 
    {
        String sentence = "Think Twice";

        // Call the reverseSentence method to reverse the sentence
        String reversedSentence = reverseSentence(sentence);

        System.out.println("Reversed sentence: "+reversedSentence);
    }

    // Method to reverse a sentence
    public static String reverseSentence(String sentence)
    {
        //Split the sentence into words
        String [] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++)
        {
            //Reverse each word
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        //Join the words back into a sentence and return it

        return String.join(" ", words);

    }
}