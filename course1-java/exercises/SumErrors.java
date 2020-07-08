/**
 * SumErrors, Sum two numeric arguments but handling erros.
 *
 * @author giuliobosco
 * @version 1.0 (2020-07-07 - 2020-07-07)
 */
public class SumErrors {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("missing first argument");
        }
        
        if (args.length < 2) {
            System.out.println("Missing second argument");
            return;
        }

        boolean aOk = false, bOk = false;
        int a = 0, b = 0;
        try {
            a = Integer.parseInt(args[0]);
            aOk = true;
        } catch (NumberFormatException nfe) {
            System.out.println("First argument is not a number");
        }

        try {
            b = Integer.parseInt(args[1]);
            bOk = true;
        } catch (NumberFormatException nfe) {
            System.out.println("Second argument is not a number");
        }

        if (aOk && bOk) {
            System.out.println(a + b);
        }
    }
}
