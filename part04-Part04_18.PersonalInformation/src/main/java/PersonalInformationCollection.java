
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String firstNameInput;
        String lastNameInput;
        String identificationNumberInput;

        System.out.println("First name: ");
        firstNameInput = scanner.nextLine();
        while (!(firstNameInput.isEmpty())) {
            System.out.println("Last name: ");
            lastNameInput = scanner.nextLine();
            System.out.println("Identification number: ");
            identificationNumberInput = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstNameInput, lastNameInput, identificationNumberInput));

            System.out.println("First name: ");
            firstNameInput = scanner.nextLine();
        }

        for (PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }
    }
}
