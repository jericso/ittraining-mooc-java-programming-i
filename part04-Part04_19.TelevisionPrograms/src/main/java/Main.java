
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String nameInput;
        int durationInput;

        System.out.println("Name: ");
        nameInput = scanner.nextLine();
        while (!(nameInput.isEmpty())) {
            System.out.println("Duration: ");
            durationInput = scanner.nextInt();
            scanner.nextLine();

            programs.add(new TelevisionProgram(nameInput, durationInput));

            System.out.println("Name: ");
            nameInput = scanner.nextLine();
        }

        System.out.println("Program's maximum duration? ");
        int maximumDuration = scanner.nextInt();
        scanner.nextLine();
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maximumDuration) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
        }
    }
}
