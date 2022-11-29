package Aufgabe6_1;

import Aufgabe6_1.Director;

public class DVD {
    final private String title;
    final private String ISBN;
    final private Director director;
    final private Actor[] actors;

    /**
     * constructor for dvd class
     * @param title
     * @param ISBN
     * @param director
     * @param actors
     */
    public DVD (String title, String ISBN, Director director, Actor[] actors){
        this.title = title;
        this.ISBN = ISBN;
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
    public String getISBN() {
        return ISBN;
    }
    public Director getDirector() {
        return director;
    }
    public Actor[] getActors() {
        return actors;
    }

}
