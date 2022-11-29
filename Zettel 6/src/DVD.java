public class DVD {
    String title;
    String ISBN;
    Director director;
    Actor[] actors;

    public DVD (String title, String ISBN, Director director, Actor[] actors){
        this.title = title;
        this.ISBN = ISBN;
        this.director = director;
        this.actors = actors;
    }
}
