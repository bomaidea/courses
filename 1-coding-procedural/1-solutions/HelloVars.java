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
                bool = true;
                System.out.println(bool + " changed");

                byte b = Byte.MAX_VALUE;
                System.out.println(b + " is byte");
                b = Byte.MIN_VALUE;
                System.out.println(b + " changed");

                short s = Short.MAX_VALUE;
                System.out.println(s + " is short");
                s = Short.MIN_VALUE;
                System.out.println(s + " changed");

                int i = Integer.MAX_VALUE;
                System.out.println(i + " is int");
                i = Integer.MIN_VALUE;
                System.out.println(i + " changed");
                
                long l = Long.MAX_VALUE;
                System.out.println(l + " is long");
                l = Long.MIN_VALUE;
                System.out.println(l + " changed");

                float f = Float.MAX_VALUE;
                System.out.println(f + " is float");
                f = Float.MIN_VALUE;
                System.out.println(f + " changed");

                double d = Double.MAX_VALUE;
                System.out.println(d + " is double");
                d = Double.MIN_VALUE;
                System.out.println(d + " changed");

                char c = 'c';
                System.out.println(c + " is char");
                c = 'd';
                System.out.println(c + " changed"); 
        }
}
