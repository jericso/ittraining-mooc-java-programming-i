
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examScores;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examScores = new ArrayList<>();
    }

    private int totalOfExamScores() {
        int totalScores = 0;
        for (int examScore : this.examScores) {
            totalScores += examScore;
        }

        return totalScores;
    }

    private int totalOfGrades() {
        int total = 0;
        for (int grade : this.grades) {
            total += grade;
        }

        return total;
    }

    public void addGradeBasedOnPoints(int points) {
        this.examScores.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfPoints() {
        if (this.examScores.size() != 0) {
            return (this.totalOfExamScores() * 1.0) / this.examScores.size();
        } else {
            return -1;
        }
    }

    public double averageOfGrades() {
        if (this.grades.size() != 0) {
            return (this.totalOfGrades() * 1.0) / this.grades.size();
        } else {
            return -1;
        }
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
