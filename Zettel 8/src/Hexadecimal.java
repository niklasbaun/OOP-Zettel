public class Hexadecimal implements Number {
    /**
     * converts a hexadecimal number to an integer
     *
     * @return the integer value of the hexadecimal number
     */
    @Override
    public int toIntValue() {
        String hex = "";
        int value = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (c >= '0' && c <= '9') {
                value += (c - '0') * Math.pow(16, hex.length() - i - 1);
            } else if (c >= 'A' && c <= 'F') {
                value += (c - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
            }
        }
        return value;
    }

    /**
     * converts an integer to a hexadecimal number
     *
     * @param value the integer value to convert
     */
    @Override
    public void fromIntValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("value must be positive");
        } else if (value == 0) {
            System.out.println("0");
        } else {
            String hex = "";
            while (value > 0) {
                int digit = value % 16;
                if (digit < 10) {
                    hex = digit + hex;
                } else {
                    hex = (char) ('A' + digit - 10) + hex;
                }
                value /= 16;
            }
            System.out.println(hex);
        }
    }
}
