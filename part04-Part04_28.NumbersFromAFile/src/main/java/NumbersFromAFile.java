
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int counter = 0;
        int fileInput = 0;
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                fileInput = Integer.valueOf(fileScanner.nextLine());
                if (fileInput >= lowerBound && fileInput <= upperBound) {
                    counter++;
                }
            }

            System.out.println("Numbers: " + counter);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
