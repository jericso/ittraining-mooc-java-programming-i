
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersEntered = 0;

        while (true) {
            System.out.println("Give a number:");

            //read number entered
            int number = Integer.valueOf(scanner.nextLine());

            //exit loop if zero entered
            if (number == 0) {
                break;
            }

            //increment number counter
            numbersEntered = numbersEntered + 1;
        }

        System.out.println("Number of numbers: " + numbersEntered);
    }
}
