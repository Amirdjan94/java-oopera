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
                super.toString() +
                ", (Рост='" + height + '\'' +
                ")}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return (height == actor.height) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode()*31 + Objects.hash(name, surname, height);
    }
}
