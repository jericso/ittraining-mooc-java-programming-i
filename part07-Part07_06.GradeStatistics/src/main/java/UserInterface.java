
import java.util.Scanner;

public class UserInterface {

    private GradeRegister gradeRegister;
    private Scanner scanner;

    public UserInterface(GradeRegister gradeRegister, Scanner scanner) {
        this.gradeRegister = gradeRegister;
        this.scanner = scanner;
    }

    private void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.gradeRegister.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    private void printAveragePassingScore() {
        if (this.gradeRegister.averagePassingScore() != 0.0) {
            System.out.println("Point average (passing): " + this.gradeRegister.averagePassingScore());
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    private void printSummary() {
        System.out.println("Point average (all): " + this.gradeRegister.averageScore());
        this.printAveragePassingScore();
        System.out.println("Pass percentage: " + this.gradeRegister.passPercentage());
        System.out.println("Grade distribution: ");
        this.printGradeDistribution();
    }

    public void start() {
        int input = 0;

        System.out.println("Enter point totals, -1 stops:");
        input = Integer.valueOf(this.scanner.nextLine());
        while (input != -1) {
            this.gradeRegister.addScore(input);

            input = Integer.valueOf(this.scanner.nextLine());
        }

        this.printSummary();
    }
}
