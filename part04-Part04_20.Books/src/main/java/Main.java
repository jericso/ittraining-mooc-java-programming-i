
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String titleInput;
        int pagesInput;
        int publicationYearInput;

        System.out.println("Title: ");
        titleInput = scanner.nextLine();
        while (!(titleInput.isEmpty())) {
            System.out.println("Pages: ");
            pagesInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Publication year: ");
            publicationYearInput = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(titleInput, pagesInput, publicationYearInput));

            System.out.println("Title: ");
            titleInput = scanner.nextLine();
        }

        System.out.println("What information will be printed? ");
        String printInformation = scanner.nextLine();        
        for (Book book : books) {
            if (printInformation.equals("everything")) {
                System.out.println(book);
            } else if (printInformation.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
