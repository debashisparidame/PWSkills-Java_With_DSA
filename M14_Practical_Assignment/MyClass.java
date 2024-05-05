package PW_SKILLS.M14_Practical_Assignment;

/*
 2. Write a program to create an object of an class which contain a method and call that class method in main method.
 */

public class MyClass 
{
    // Method to display a message
    public void displayMessage() {
        System.out.println("Hello, from MyClass!");
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass();
        
        // Calling the method of MyClass using the object
        obj.displayMessage();
    }
}
