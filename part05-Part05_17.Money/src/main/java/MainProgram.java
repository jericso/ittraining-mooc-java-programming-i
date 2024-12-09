
public class MainProgram {

    public static void main(String[] args) {
        // Plus test
        Money a = new Money(10, 99);
        Money b = new Money(5, 1);

        Money c = a.plus(b);

        System.out.println(a);  // 10.99e
        System.out.println(b);  // 5.01e
        System.out.println(c);  // 16.00e

        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
                                // the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 26.99e
        System.out.println(b);  // 5.01e
        System.out.println(c);  // 16.00e

        // Less test
        Money d = new Money(10, 0);
        Money e = new Money(3, 0);
        Money f = new Money(5, 0);

        System.out.println(d.lessThan(e));  // false
        System.out.println(e.lessThan(f));  // true

        // Minus test
        Money g = new Money(10, 0);
        Money h = new Money(3, 50);

        Money i = g.minus(h);

        System.out.println(g);  // 10.00e
        System.out.println(h);  // 3.50e
        System.out.println(i);  // 6.50e

        i = i.minus(g);         // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
                                // the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(g);  // 10.00e
        System.out.println(h);  // 3.50e
        System.out.println(i);  // 0.00e
    }
}
