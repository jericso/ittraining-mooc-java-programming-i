
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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

        //print number count
        System.out.println("Number of numbers: " + numberCount);

        //print sum of numbers
        System.out.println("Sum of the numbers: " + numberSum);
    }
}
