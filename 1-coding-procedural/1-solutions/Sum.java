/**
 * Sum, is the program who sums two arguments.
 *
 * @author giuliobosco
 * @version 1.0 (2020-07-07 - 2020-07-07)
 */
public class Sum {
    public static void main(String[] args) {
        if (args.length > 1) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int sum = a + b;

            System.out.println(sum);
        } else {
            System.out.println("missing arguments.");
        }
    }
}
