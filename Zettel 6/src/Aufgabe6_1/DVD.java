package Aufgabe6_1;

import Aufgabe6_1.Director;
/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
public class DVD {
    final private String title;
    //ISBN is called ISAN for movies
    final private String ISAN;
    final private Director director;
    final private Actor[] actors;

    /**
     * constructor for dvd class
     * @param title
     * @param ISAN
     * @param director
     * @param actors
     */
    public DVD (String title, String ISAN, Director director, Actor[] actors){
        this.title = title;
        this.ISAN = ISAN;
        this.director = director;
        this.actors = actors;
    }

    /**
     * getter methods for title, ISBN, director and actors
     * @return the title, ISBN, director or actors
     */
    public String getTitle() {
        return title;
    }
    public String getISAN() {
        return ISAN;
    }
    public Director getDirector() {
        return director;
    }
    public Actor[] getActors() {
        return actors;
    }

}
