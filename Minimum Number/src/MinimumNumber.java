import java.util.Scanner;

public class MinimumNumber {

    private static Scanner scanner = new Scanner(System.in);

    private static int readInteger() {
        System.out.println("Enter count : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private static int[] readElements(int count) {
        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            System.out.println("Enter number : ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < array.length ; i++) {
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        int min = findMin(array);
        System.out.println("Minimum value is : " + min);
    }
}
