import data.Gender;
import data.Scenario;
import employee.*;
import theaterShow.Ballet;
import theaterShow.MusicalShow;
import theaterShow.Opera;
import theaterShow.Show;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Theatre theatre = new Theatre();
        //Создаю трех актеров
        Actor actor1 = new Actor(Gender.MALE, "Сергей", "Иванов", 170);
        Actor actor2 = new Actor(Gender.MALE, "Виталий", "Хара", 185);
        Actor actor3 = new Actor(Gender.FEMALE, "Анна", "Четверикова", 160);

        //Создаю двух режиссеров
        Director director1 = new Director(Gender.MALE, "Евгений", "Козлов", 15);
        Director director2 = new Director(Gender.FEMALE, "Виктрия", "Авякан", 20);

        //Создаю одного автора музыки
        MusicAuthor musicAuthor = new MusicAuthor(Gender.MALE, "Степан", "Безбородов");

        //Создаю одного хорегографа
        Choreographer choreographer = new Choreographer(Gender.FEMALE, "Анастасия", "Гордеева");

        //Создаю обычный спектакль
        Show show = new Show(director1, 150, new ArrayList<>(), Scenario.CRIME_AND_PUNISHMENT.getNameOfShow());

        //Создаю оперу
        Opera opera = new Opera(director2, 180, new ArrayList<>(), Scenario.CARMEN.getNameOfShow(),
                Scenario.SWAN_LAKE.getLibretto(), musicAuthor, 15);

        //Создаю баллет
        Ballet ballet = new Ballet(director1, 60, new ArrayList<>(), Scenario.SWAN_LAKE.getNameOfShow(),
                Scenario.SWAN_LAKE.getLibretto(),
                musicAuthor, choreographer);

        //Добавляю актеров
        System.out.println("Добавляю актеров в спектакль");
        show.addNewActor(actor1);
        show.addNewActor(actor2);
        show.addNewActor(actor3);
        printDivide();

        System.out.println("Добавляю актеров в оперу");
        opera.addNewActor(actor1);
        opera.addNewActor(actor3);
        printDivide();

        System.out.println("Добавляю актеров в балет");
        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);
        printDivide();

        //Вывод актеров в спектаклях
        System.out.println("Список актеров в спектакле");
        show.printActorList();

        System.out.println("Список актеров в опере");
        opera.printActorList();

        System.out.println("Список актеров в балете");
        ballet.printActorList();

        //Замена актера в баллете и вывод обновленного списка
        ballet.replaceActor(actor1, actor2.surname);
        System.out.println("Список актеров в балете");
        ballet.printActorList();

        //Попытка замены не существующего актера
        opera.replaceActor(actor2, "Неизвестнов");
        printDivide();

        //Отображение текста либретто
        System.out.println("Текст либретто для Оперы");
        opera.printLibrettoText();
        printDivide();

        System.out.println("Текст либретто для Балета");
        ballet.printLibrettoText();
        printDivide();


        printLibretto(opera);

    }

    public static void printLibretto(MusicalShow musicalShow) {
        musicalShow.printLibrettoText();
        printDivide();
    }

    public static void printDivide() {
        System.out.println("-".repeat(20));
    }
}
