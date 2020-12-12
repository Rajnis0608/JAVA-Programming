import java.util.Scanner;

public class MinimunAndMaximum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while(true) {

            System.out.println("Enter Number : ");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int num = scanner.nextInt();

                if(num > max){
                    max = num;
                }
                if(num < min){
                    min = num;
                }
            }
            else{
                System.out.println("Invalid Value");
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);
    }
}
