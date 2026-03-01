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
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname == surname) {
                return i;
            }
        }
        return -1;
    }

    public void replaceActor (Actor newActor, String existActorSurname){
        int index = checkExistActor(existActorSurname);
        if ( index == -1 ) {
            System.out.println("В списках нет актера с такой фамилией - " + existActorSurname);
        } else {
            listOfActors.set(index, newActor);
            System.out.println("Актер " + existActorSurname + " заменен на " + newActor.surname);
        }
    }
}
