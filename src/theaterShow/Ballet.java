package theaterShow;

import employee.Actor;
import employee.Choreographer;
import employee.Director;
import employee.MusicAuthor;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    Choreographer choreographer;

    public Ballet(Director director, int duration, ArrayList<Actor> listOfActors, String title, String librettoText,
                  MusicAuthor musicAuthor, Choreographer choreographer) {
        super(director, duration, listOfActors, title, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }
}
