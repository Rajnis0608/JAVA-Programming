import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long avg=0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int x = scanner.nextInt();
                count++;
                sum += x;
                avg = Math.round((double)sum/count);
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }
}
