package PW_SKILLS.M14_Practical_Assignment;

/*
 3. Write a Java program to calculate the sum of all elements in an integer array?
 */

public class ArraySum 
{
    public static void main(String[] args) {
        // Integer array
        int[] numbers = {5, 10, 15, 20, 25};

        // Calculate sum of array elements
        int sum = calculateSum(numbers);

        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }

    // Method to calculate sum of array elements
    public static int calculateSum(int[] arr) {
        int sum = 0;
        // Iterate through the array and add each element to sum
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
