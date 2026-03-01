package employee;

import data.Gender;

import java.util.Objects;

public class Person {
    public String name;
    public String surname;
    public Gender gender;

    public Person(Gender gender, String name, String surname) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}
