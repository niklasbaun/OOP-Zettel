public class Bellyray extends Herbivore{

    /**
     * Constructor for Bellyray, with a size only allowed to be between 7m and 9m.
     * @param size size of the Bellyray
     */
    public Bellyray(int size) throws SizeException {
        super(size);
        if (size < 700 || size > 900) {
            throw new SizeException("Size must be between 7m and 9m.");
        }
    }

}