/**
 * HelloVars, print a value and his type for each available native type.
 *
 * @author giuliobosco
 * @version 1.0 (2020-07-07 - 2020-07-07)
 */

public class HelloVars {
        public static void main(String[] args) {
                boolean bool = false;
                System.out.println(bool + " is boolean");

                byte b = Byte.MAX_VALUE;
                System.out.println(b + " is int");

                short s = Short.MAX_VALUE;
                System.out.println(s + " is short");

                int i = Integer.MAX_VALUE;
                System.out.println(i + " is int");
                
                long l = Long.MAX_VALUE;
                System.out.println(l + " is long");

                float f = Float.MAX_VALUE;
                System.out.println(f + " is float");

                double d = Double.MAX_VALUE;
                System.out.println(d + " is double");

                char c = 'c';
                System.out.println(c + " is char"); 
        }
}
