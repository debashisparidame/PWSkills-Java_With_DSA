package PW_SKILLS.M16.Practical;

/*
   1. Create a class that keeps track of the number of instances created. Implement a static
      variable and method to accomplish this.
 */

public class MyClass 
{
    //Static variable to keep track of the number of instances created
    private static int instanceCount = 0;

    public MyClass()
    {
         instanceCount++;
    }

      //Static method to return the number of instances created
      public static int getInstanceCount()
      {
          return instanceCount;
      }

      @SuppressWarnings("unused")
    public static void main(String[] args) 
      {
            //Create three instances of MyClass
            MyClass obj1 = new MyClass();
            MyClass obj2 = new MyClass();
            MyClass obj3 = new MyClass();
    
            //Print the number of instances created
            System.out.println("Number of instances created: " + MyClass.getInstanceCount());
      }
}
