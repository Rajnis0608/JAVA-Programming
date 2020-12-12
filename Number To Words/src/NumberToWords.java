public class NumberToWords {

    public static int reverse(int number){

        int reverseNum = 0;
        while(number != 0){
            reverseNum = reverseNum * 10 + (number % 10);
            number = number / 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number){

        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int count = 0;
        while(number != 0){
            count++;
            number = number / 10;
        }
        return count;
    }

    public static void numberToWords(int number){

        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }

        if(number == 0){
            System.out.println("Zero");
            return;
        }

        int reverseNumber = reverse(number);
        int numberOfDigits = getDigitCount(number);
        int numberOfDigitsInReverse = getDigitCount(reverseNumber);
        int rem = number;
        int num = reverseNumber;

        while(num != 0){
            rem = num % 10;
            num = num / 10;
            switch (rem){
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
            }

        }
        if(numberOfDigits != numberOfDigitsInReverse )
        {
            for(int i = numberOfDigits - numberOfDigitsInReverse; i> 0;i--){
                System.out.println("Zero");
            }
        }
    }

    public static void main(String[] args) {
        numberToWords(123);
        System.out.println();
        numberToWords(1010);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(-12);
        System.out.println();
        numberToWords(0);
    }
}
