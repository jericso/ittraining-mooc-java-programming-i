
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
        if (leo.equals(lily)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        Person leoTwin = new Person("Leo", date, 62, 9);
        if (leo.equals(leoTwin)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
