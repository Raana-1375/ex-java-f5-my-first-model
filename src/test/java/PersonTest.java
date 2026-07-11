import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testGetName() {
        Person person = new Person("Ali", "Yilmaz", "12345", 2000);
        assertEquals("Ali", person.getName());
    }

    @Test
    public void testGetSurname() {
        Person person = new Person("Ali", "Yilmaz", "12345", 2000);
        assertEquals("Yilmaz", person.getSurname());
    }

    @Test
    public void testGetIdentityNumber() {
        Person person = new Person("Ali", "Yilmaz", "12345", 2000);
        assertEquals("12345", person.getIdentityNumber());
    }

    @Test
    public void testGetBirthYear() {
        Person person = new Person("Ali", "Yilmaz", "12345", 2000);
        assertEquals(2000, person.getBirthYear());
    }

    @Test
    public void testGetAge() {
        Person person = new Person("Ali", "Yilmaz", "12345", 2000);
        assertEquals(26, person.getAge(2026));
    }
}