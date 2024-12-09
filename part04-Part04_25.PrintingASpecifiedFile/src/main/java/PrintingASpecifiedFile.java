
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner fileSelectScanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = fileSelectScanner.nextLine();

        // we create a scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
