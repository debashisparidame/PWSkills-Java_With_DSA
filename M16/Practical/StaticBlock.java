package PW_SKILLS.M16.Practical;

/*
    5.Write a program which has static block and constructor overloading,initialise variables
      using constructors and print it.
 */

public class StaticBlock 
{
    public String name;
    public int age;

    public StaticBlock()
    {
        System.out.println("No args constructor");
    }

    public StaticBlock(int age)
    {
        super();
        this.age = age;
    }

    public StaticBlock(String name)
    {
        super();
        this.name = name;
    }

    public StaticBlock (String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "StaticBlock [name=" + name + ", age=" + age + "]";
    }

    static
    {
      System.out.println("Static block");
    }

    public static void main(String[] args) {
      StaticBlock obj1 = new StaticBlock(20);
      System.out.println(obj1.age);
      StaticBlock obj2 = new StaticBlock("Kohil");
      System.out.println(obj2.name);
      StaticBlock obj3 = new StaticBlock("Debashis", 23);
      System.out.println(obj3.toString());
    }
}
