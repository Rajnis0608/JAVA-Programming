public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        if(number < 0){
            return -1;
        }

        int rem = number;
        int sum = 0;
        while(number!=0){
            rem = number % 10;
            number = number / 10;
            if(rem % 2 == 0){
                sum += rem;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
