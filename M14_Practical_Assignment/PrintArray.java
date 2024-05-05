package PW_SKILLS.M14_Practical_Assignment;

/*
    5. Write a Java program to print an entire array?
 */

public class PrintArray 
{
    public static void main(String[] args) {
        // Integer array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the entire array
        System.out.print("Array elements: ");
        printArray(numbers);
    }

    // Method to print the entire array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", "); // Print comma and space for elements except the last one
            }
        }
        System.out.println(); // Print newline after printing the array
    }   
}
