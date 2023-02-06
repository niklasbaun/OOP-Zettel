public class Transition {
    private final String idStart;
    private final String idEnd;
    private Character symbol;

    public Transition(String idStart, String idEnd, Character symbol) {
        this.idStart = idStart;
        this.idEnd = idEnd;
        this.symbol = symbol;
    }

    /**Getter Method for String idStart
     *
     * @return The value of String idStart
     */
    public String getIdStart() {
        return idStart;
    }

    /**Getter Method for String idEnd
     *
     * @return The value of String idEnd
     */
    public String getIdEnd() {
        return idEnd;
    }

    /**Getter Method for String symbol
     *
     * @return The value of String symbol
     */
    public Character getSymbol() {
        return symbol;
    }
}
