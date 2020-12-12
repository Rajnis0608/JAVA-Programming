import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Maiin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int sum = 0;
        while(counter < 10){
            int i = counter + 1;
            System.out.println("Enter number #" + i + ":");
            boolean hasNextInt=scanner.hasNextInt();
            if(hasNextInt){
                int x = scanner.nextInt();
                counter++;
                sum += x;
            }
            else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
            i++;
        }
        scanner.close();
        System.out.println("Sum is " + sum);
    }
}
