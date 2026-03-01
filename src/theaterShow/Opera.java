package theaterShow;

import employee.Actor;
import employee.Director;
import employee.MusicAuthor;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    int choirSize;

    public Opera(Director director, int duration, ArrayList<Actor> listOfActors, String title, String librettoText,
                 MusicAuthor musicAuthor, int choirSize) {
        super(director, duration, listOfActors, title, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }
}
