
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> scores;
    private ArrayList<Integer> passingScores;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.scores = new ArrayList<>();
        this.passingScores = new ArrayList<>();
    }

    public static int scoreToGrade(int score) {
        int grade = 0;

        if (score < 50) {
            grade = 0;
        } else if (score < 60) {
            grade = 1;
        } else if (score < 70) {
            grade = 2;
        } else if (score < 80) {
            grade = 3;
        } else if (score < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public void addScore(int score) {
        if (score >= 0 && score <= 100) {
            this.scores.add(score);
            this.grades.add(scoreToGrade(score));

            if (score >= 50) {
                this.passingScores.add(score);
            }
        }
    }

    public double averageScore() {
        if (this.scores.size() == 0) {
            return 0.0;
        }

        int totalScores = 0;
        for (int score : this.scores) {
            totalScores += score;
        }

        return (totalScores * 1.0) / this.scores.size();
    }

    public double averagePassingScore() {
        if (this.passingScores.size() == 0) {
            return 0.0;
        }

        int totalPassingScores = 0;
        for (int passingScore : this.passingScores) {
            totalPassingScores += passingScore;
        }

        return (totalPassingScores * 1.0) / this.passingScores.size();
    }

    public double passPercentage() {
        if (this.passingScores.size() == 0) {
            return 0.0;
        }

        return (100 * this.passingScores.size() * 1.0) / this.scores.size();
    }

    public int numberOfGrades(int gradeToCount) {
        int gradeTotal = 0;
        for (int grade : this.grades) {
            if (grade == gradeToCount) {
                gradeTotal++;
            }
        }

        return gradeTotal;
    }
}
