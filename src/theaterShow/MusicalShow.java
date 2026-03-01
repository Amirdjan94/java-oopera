package theaterShow;

import employee.Actor;
import employee.Director;
import employee.MusicAuthor;

import java.util.ArrayList;

public class MusicalShow extends Show {
    MusicAuthor musicAuthor;
    String librettoText;

    public MusicalShow(Director director, int duration, ArrayList<Actor> listOfActors, String title,
                       String librettoText, MusicAuthor musicAuthor) {
        super(director, duration, listOfActors, title);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibrettoText(){ //Распечатать текст либретто
        System.out.println("Текст либретты - " + librettoText);
    }


}
