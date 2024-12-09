
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = 0;
        int numberSum = 0;

        while (true) {
            System.out.println("Give a number:");

            //read number entered
            int number = Integer.valueOf(scanner.nextLine());

            //exit loop if zero entered
            if (number == 0) {
                break;
            }

            //increment number counter
            numberCount = numberCount + 1;

            //add number to sum
            numberSum = numberSum + number;
        }

        //print average of numbers
        System.out.println("Average of the numbers: " + ((double) numberSum / numberCount));
    }
}
