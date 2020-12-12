public class LAstDigitChecker {

    public static boolean isValid(int x) {
        if ((x < 10 || x > 1000)) {
            return false;
        }
        return true;
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            int remx = x % 10;
            int remy = y % 10;
            int remz = z % 10;
            if ((remx == remy) || (remy == remz) || (remx == remz))
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,19));
    }
}

