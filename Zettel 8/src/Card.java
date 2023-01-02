/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
public class Card implements Comparable {
    private final String name;
    private static String type;
    private final int yearOfPublication;

    /**
     * constructor of card
     * @param name the name of the card
     * @param yearOfPublication the year of publication of the card
     */
    public Card(String name, int yearOfPublication) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * set the different types of cards
     */
    public final static void  Effect_Monster() {
        type = "Effect Monster";
    }
    public final static void  Normal_Monster() {
        type = "Normal Monster";
    }
    public final static void Trap(){
        type = "Trap";
    }
    public final static void Spell(){
        type = "Spell";
    }

    /**
     * method to get the name of the card
     * @return the name of the card
     */
    public String getName() {
        return name;
    }
    /**
     * method to get the type of the card
     * @return the type of the card
     */
    public String getType() {
        return type;
    }
    /**
     * method to get the year of publication of the card
     * @return the year of publication of the card
     */
    public int getYearOfPublication() {
        return yearOfPublication;
    }


    //compare in order of year of publication, then type, then name

    /**
     * method to compare to objects of type card, by these values
     *              1. the year of publication
     *              2. the type of the card in the following order (normal mosnter; effect monster; spell card;  trap card)
     *              3. by the name in alphabetic order
     * @param o the object to be compared.
     * @return integer 0 if equal; negativ num if less and positiv if the object is greater in the specified order
     */
    @Override
    public int compareTo(Object o) {
        Card c = (Card) o;
        int year = this.yearOfPublication - c.yearOfPublication;
        if (year != 0) {
            return year;
        }
        int type = this.getType().compareTo(c.getType());
        if (type != 0) {
            return type;
        }
        return this.getName().compareTo(c.getName());
    }


}