package src;

public class Person {
    private String name;
    private String surname;
    private String identityNumber;
    private int birthYear;

    public Person(String name, String surname, String identityNumber, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.identityNumber = identityNumber;
        this.birthYear = birthYear;
    }

    public int getAge(int currentYear) {
        return currentYear - this.birthYear;
    }
}
