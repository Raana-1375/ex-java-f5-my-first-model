package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import src.Person;

public class PersonTest {

    @Test
    public void testGetAge() {
        Person person = new Person("Ali", "Yilmaz", "12345", 2000);
        assertEquals(26, person.getAge(2026));
    }
}