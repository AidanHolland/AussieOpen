package australianopen;
import java.io.Serializable;

public class Player implements Serializable
{
    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    String country;
    private int id;
    
    public Player(){}
    
    public Player(String firstName, String lastName, int age, char gender, String country) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.country = country;  
    }
    
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getCountry()
    {
        return country;
    }
        
    @Override
    public String toString()
    {
        return "Name: " + firstName + " " + lastName + "\nAge: " + age 
                + "Gender:"  + gender+ "\nCountry: " + country + ".";
    }
    
}




