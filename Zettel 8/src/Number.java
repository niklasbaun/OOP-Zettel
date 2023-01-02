/**
 * @author Walter, Annika; Baun, Niklas; Mahlberg, Kilian
 */
public interface Number {
    /**
     * interface method to convert sth to an integer number
     */
    int toIntValue();

    /**
     * interface method to convert from an integer to sth different
     * @param value
     */
    void fromIntValue(int value);

    //default methods

    /**
     * method to add a number to  a value
     * @param number the num to add
     */
    default void add(Number number){
        fromIntValue(toIntValue() + number.toIntValue());
    }

    /**
     * method to subtract a number from a value
     * @param number the num to subtract
     */
    default void subtract(Number number){
        fromIntValue(toIntValue() - number.toIntValue());
    }

    /**
     * method to multiply by a given number
     * @param number the num to multiply with
     */
    default void multiply(Number number){
        fromIntValue(toIntValue() * number.toIntValue());
    }

    /**
     * method to divide by a num
     * @param number the num to  divide by
     */
    default void divide(Number number){
        fromIntValue(toIntValue() / number.toIntValue());
    }
}
