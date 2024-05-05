package PW_SKILLS.M14_Practical_Assignment;

/*
    4. Write a program to find the index of an element in an array.
 */

public class ElementIndex 
{
    public static void main(String[] args) {
        // Integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Element to find
        int target = 30;

        // Find index of the target element
        int index = findElementIndex(numbers, target);

        // Print the index
        if (index != -1) {
            System.out.println("Index of " + target + " in the array: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    // Method to find index of specific element in array
    public static int findElementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if element found
            }
        }
        return -1; // Return -1 if element not found
    }
}
