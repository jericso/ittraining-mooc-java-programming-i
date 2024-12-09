
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNegative = 0;

        while (true) {
            System.out.println("Give a number:");

            //read number entered
            int number = Integer.valueOf(scanner.nextLine());

            //exit loop if zero entered 
            if (number == 0) {
                break;
            }

            //increment number counter if negative number entered 
            if (number < 0) {
                numberOfNegative = numberOfNegative + 1;
            }
        }

        //print total of negative numbers entered
        System.out.println("Number of negative numbers: " + numberOfNegative);
    }
}
