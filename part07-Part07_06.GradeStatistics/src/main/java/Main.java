
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeRegister gradeRegister = new GradeRegister();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(gradeRegister, scanner);
        ui.start();
    }
}
