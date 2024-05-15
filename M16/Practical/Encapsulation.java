package PW_SKILLS.M16.Practical;

/*
    3. Use a private keyword for a variable and use setter and getter methods to initialise and
       print the values.
 */

public class Encapsulation
{
    //Instance variables
    private String name;
    private int age;
    
    //Constructor with parameters
    public Encapsulation(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
}

class Demo
{
    public static void main(String[] args) 
    {
        Encapsulation obj = new Encapsulation("Raja", 30); //Creating object of Encapsulation class

        System.out.println("Name:"+obj.getName());
        System.out.println("Age:"+obj.getAge());
    }
}
