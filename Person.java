
/**
 * BCIT_JavaSem01-Lab05v2 Lab from Gary Tong;
 * A class to model Person objects
 * 
 * @author K.Szczurowski
 * @version 1.1
 * @since 11/052016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2110012/View
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    
    /**Static class variable to hold number of instnaces created */
    public static int counter = 0;
    
    /**
     * Public static method to return number of objects created of this type;
     * @return return number of instances created, as Integer;
     */
    public static int getCounter()
    {
        return counter;
    }
    
    /**
     * Default constructor which sets all instance variables; <br>
     * Additionally, it sets a static variable, counter, that will be shared accross all instances;
     */
    public Person()
    {
        firstName = "John";
        lastName = "Doe";
        age = 50;
        height = 150;
        
        counter++;
    }
    
    /**
     * Custom constructor to allow to set instance variables;
     * @param first name as String;
     * @param last name as String;
     * @param age as Integer;
     * @param height as double;
     * 
     */
    public Person(String firstName, String lastName, int age, double height)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        
        counter++;
    }
    
    /**
     * Public getter/method to fetch value of first name;<br>
     * It does not take parameters; <br>
     * @return return first name as String;
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    
    /**
     * Public setter/method to set the value of first name;<br>
     * It does not return any value;<br>
     * @param it takes value as String;
     */
    public void setFirstName(String value)
    {
        this.firstName = (value == null || value.equals("")) ? "John" : value;
    }
    
    /**
     * Public getter/method to get the value of age;<br>
     * It does not take any parameters;<br>
     * @return returns age as Integer;
     */
    public int getAge()
    {
        return this.age;
    }
    
    /**
     * Public setter/method to set the valie of Age;<br>
     * It does not return any value;<br>
     * It validates age making sure age is not zero or below;<br>
     * @param value parameter as Integer;
     */
    public void setAge(int value)
    {
        this.age = (value <= 0 ? 30 : value);
    }
    
    /**
     * Public method to get the name tag;<br>
     * It does not take any parameter;<br>
     * @return returns concatinated name tag as String;
     */
    public String getNameTag()
    {
        return "Hello, my name is " + firstName + " " + lastName;
    }
    
    /**
     * Public method to print out concatinated First Name and Last Name;<br>
     * It does not take any parameter and it does not return any value;
     */
    public void printNameTag()
    {
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }
    
    /**
     * Public method to return number of instance created;
     * @return returns a string representing number of instances created
     */
    public String getNumberOfTimesCreated()
    {
        String result = "";
        switch(counter)
        {
            case 0 :
                result = "none";
                break;
            case 1 :
                result = "once";
                break;
            case 2 : 
                result = "twice";
                break;
            default:
            result = "Too many times !!!";
        }
        return result;
    }
}
