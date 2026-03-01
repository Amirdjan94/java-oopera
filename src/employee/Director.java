package employee;

import data.Gender;

public class Director extends Person {
    public int numberOfShows;

    public Director(Gender gender, String name, String surname, int numberOfShows) {
        super(gender, name, surname);
        this.numberOfShows = numberOfShows;

    }

    @Override
    public String toString() {
        return "Режиссер{" +
                "Имя ='" + name + '\'' +
                ", Фамилия ='" + surname + '\'' +
                '}';
    }

    public void printDirector() { //Распечатать информацию о режиссёре спектакля
        System.out.println(this.toString());
    }
}
