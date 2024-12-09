
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumberCount = 0;
        int positiveNumberSum = 0;

        while (true) {
            System.out.println("Give a number:");

            //read number entered
            int number = Integer.valueOf(scanner.nextLine());

            //exit loop if zero entered
            if (number == 0) {
                break;
            }

            //increment positive number count and add number to positive number sum if number is positive
            if (number > 0) {
                //increment number counter
                positiveNumberCount = positiveNumberCount + 1;

                //add number to sum
                positiveNumberSum = positiveNumberSum + number;
            }
        }

        //print average of positive numbers if positive number(s) entered
        if (positiveNumberCount > 0) {
            System.out.println((double) positiveNumberSum / positiveNumberCount);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
