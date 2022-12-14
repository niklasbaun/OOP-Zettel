import java.util.Date;

public class Card {
    private final String name;
    private final String type;
    private final Date yearOfPublication;


    public Card(String name, String type, Date yearOfPublication) {
        this.name = name;
        this.type = type;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getYearOfPublication() {
        return yearOfPublication;
    }

    //set Card to a specific type
    //Was für kartentypen gibt es denn?
}
