import java.util.Date;

public class Card implements Comparable {
    private final String name;
    String type;
    private final String type = "Effect_Monster";
    private final String type = "Normal_Monster";
    private final String type = "Spell";
    private final String type = "Trap";

    private final Date yearOfPublication;


    public Card(String name, Date yearOfPublication) {
        this.name = name;
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

    @Override
    public int compareTo(Object o) {
        Card c = (Card) o;

        return 0;
    }
}