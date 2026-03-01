package employee;

import data.Gender;

import java.util.Objects;

public class Actor extends Person {
    public int height;

    public Actor(Gender gender, String name, String surname, int height) {
        super(gender, name, surname);
        this.height = height;

    }

    @Override
    public String toString() {
        return "Актер{" +
                "Имя ='" + name + '\'' +
                ", Фамилия ='" + surname + '\'' +
                ", (Рост='" + height + '\'' +
                ")}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return (height == actor.height) &&
                Objects.equals(((Person) o).name, ((Person) this).name) &&
                Objects.equals(((Person) o).surname, ((Person) this).surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
