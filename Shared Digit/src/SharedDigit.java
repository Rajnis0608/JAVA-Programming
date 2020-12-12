public class SharedDigit {

    public static boolean hasSharedDigit(int num1,int num2){

        if((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)){
            return false;
        }

        int rem1 = num1 % 10;
        int rem2 = num2 % 10;
        num1 = num1/10;
        num2 = num2/10;

        if((rem1 == rem2 )|| (rem1 == num2) || (num1 == num2) || (num1 == rem2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
}
