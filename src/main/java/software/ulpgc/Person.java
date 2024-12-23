package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int daysYear = 365;
    private final String name;
    private final LocalDate birthdate;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "age='" + this.getYears() + '\'' +
                '}';
    }

    private int getYears() {
        return (int) getAge() / daysYear;
    }

    private long getAge() {
        return LocalDate.now().toEpochDay() - birthdate.toEpochDay();
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
}
