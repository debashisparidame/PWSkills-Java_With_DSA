package PW_SKILLS.M14_Practical_Assignment;

/*
1. Write a program to demonstrate method overloading with 3 different parameters.
 */

public class MethodOverloading 
{
    // Method with one parameter
    public void display(int num) {
        System.out.println("Method with one parameter: " + num);
    }

    // Method with two parameters
    public void display(int num1, int num2) {
        System.out.println("Method with two parameters: " + num1 + ", " + num2);
    }

    // Method with three parameters
    public void display(int num1, int num2, int num3) {
        System.out.println("Method with three parameters: " + num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Call method with one parameter
        obj.display(10);

        // Call method with two parameters
        obj.display(20, 30);

        // Call method with three parameters
        obj.display(40, 50, 60);
    }
}