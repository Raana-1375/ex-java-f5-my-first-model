package test;
import src.Person;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Loading test...");
        
        Person person = new Person("Ali", "Yilmaz", "12345", 2000);
        
        if (person.getAge(2026) == 26) {
            System.out.println("Test successful!");
        } else {
            System.out.println("Test failed!");
        }
    }
}