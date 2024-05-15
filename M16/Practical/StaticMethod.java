package PW_SKILLS.M16.Practical;

/*
    4.Write a program to call an method without creating an object of a class
 */

public class StaticMethod 
{

    public static void disp()
    {
        System.out.println("Satic Method");
    }
   public static void main(String[] args) 
   {
       StaticMethod.disp();
   }   
}
