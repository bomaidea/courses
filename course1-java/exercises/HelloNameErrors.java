/**
 * HelloNameErrors, says hello to the name passed as first argument to the program, checking if the name has been passed.
 *
 * @author giuliobosco
 * @version 1.0 (2020-07-07 - 2020-07-07)
 */

public class HelloNameErrors {
        public static void main(String[] args) {
                if (args.length > 0) {
                        System.out.println("Hello " + args[0] + "!");
                } else {
                        System.out.println("Insert your name as parameter.");
                }
        }
}
