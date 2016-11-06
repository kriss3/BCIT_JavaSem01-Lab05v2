
/**
 * A class to model a Person
 * 
 * @author K.Szczurowski
 * @version 1.1
 * @date 28/10/2016
 * @since 10/28/2016
 * 
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    
    public static int counter = 0;
    
    
    public static void setCounter(int _counter)
    {
        counter = _counter;
    }
    
    public static int getCounter()
    {
        return counter;
    }
    
    public Person()
    {
        firstName = "John";
        lastName = "Doe";
        age = 50;
        height = 150;
        
        counter++;
    }
    
    public Person(String firstName, String lastName, int age, double height)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        
        counter++;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public void setFirstName(String value)
    {
        this.firstName = (value == null || value.equals("")) ? "John" : value;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void setAge(int value)
    {
        this.age = (value > 0 ? value : 30);
    }
    
    public String getNameTag()
    {
        return "Hello, my name is " + firstName + " " + lastName;
    }
    
    public void printNameTag()
    {
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }
    
    public String getNumberOfTimesCreated()
    {
        switch(counter)
        {
            case 0 :
            return "none";
            case 1 : 
            return "once";
            case 2 : 
            return "twice";
            default:
            return "Too many times !!!";
        }
    }
}
