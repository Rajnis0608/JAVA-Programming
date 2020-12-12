public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;

        while(temp != 0)
        {
            reverse = reverse*10 +temp % 10;
            temp = temp /10;
        }

        if(reverse == number){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
