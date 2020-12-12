public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number < 0) {
            return -1;
        }
        int rem=number;
        int sum = number % 10;
        while(number != 0){
             rem = number % 10;
             number = number / 10;
        }
        sum = sum + rem;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));


    }
}
