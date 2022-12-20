import java.util.Date;

public class Card implements Comparable {
    private final String name;
    private final String type;
    private final Date yearOfPublication;
    private final static String[] types = {"Normal_Monster","Effect_Monster", "Spell", "Trap"};


    public Card(String name, int type, Date yearOfPublication) {
        this.name = name;
        this.type = types[type];
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

    //comparable methods
    @Override
    public boolean isSorted(Comparable[] array) {
        return false;
    }
    //Normales Monster → Effekt Monster → Zauberkarte → Fallenkarte
    @Override
    public boolean isSmaller(Comparable a, Comparable b) {
        return false;
    }

    @Override
    public boolean isBigger(Comparable a, Comparable b) {

        return false;
    }

    @Override
    public boolean isEqual(Comparable a, Comparable b) {
        return false;
    }
}
