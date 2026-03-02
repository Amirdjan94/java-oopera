package theaterShow;

import employee.Actor;
import employee.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(Director director, int duration, ArrayList<Actor> listOfActors, String title) {
        this.director = director;
        this.duration = duration;
        this.listOfActors = listOfActors;
        this.title = title;
    }

    public void printActorList(){ //Распечатать список всех актеров
        System.out.println("Список актеров: ");
        for (Actor listOfActor : listOfActors) {
            System.out.println(listOfActor);
        }
        System.out.println("-".repeat(20));
    }

    public void addNewActor(Actor newActor) { //Добавить нового актера в спектакль
        if (!checkExistActor(newActor)) {
            listOfActors.add(newActor);
            System.out.println("Добавлен в список новый актер: " + newActor);
        } else {
            System.out.println("Новый актер не добавлен. Указанный актер существует в списках");
        }

    }

    public boolean checkExistActor (Actor newActor){ // Проверка на существование актера в списке
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                return true;
            }
        }
        return false;
    }

    public int checkExistActor (String surname){ // Проверка на существование актера в списке. Перегрузка метода
        int countOfActorWithSurname = 0;
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                index = i;
                countOfActorWithSurname++;
            }
        }
        if (countOfActorWithSurname == 0){
            return -1;
        } else  if (countOfActorWithSurname > 1){
            return -2;
        } else {
            return index;
        }


    }

    public void replaceActor (Actor newActor, String existActorSurname){
        int index = checkExistActor(existActorSurname);
        if ( index == -1 ) {
            System.out.println("В списках нет актера с такой фамилией - " + existActorSurname);
        } else if ( index == -2 ) {
            System.out.println("В списках есть однофамильцы, замена не произошла - " + existActorSurname);
        } else {
            listOfActors.set(index, newActor);
            System.out.println("Актер " + existActorSurname + " заменен на " + newActor.getSurname());
        }
    }

    public void printDirector() { //Распечатать информацию о режиссёре спектакля
        System.out.println(director);
    }

}
