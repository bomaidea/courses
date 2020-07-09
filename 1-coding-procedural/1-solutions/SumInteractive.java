/**
 * SumInteractive, with Interactive mode or cli mode.
 *
 * @author giuliobosco
 * @version 1.0 (2020-07-08 - 2020-07-08)
 */

import java.io.*;

public class SumInteractive {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("missing arguments.");
            return;
        }

        if (args.length == 1) {
            if (args[0].equals("-i")) {
                try {
                    InputStreamReader input = new InputStreamReader(System.in);
                    BufferedReader keyboard = new BufferedReader(input);

                    int a = 0, b = 0;
                    boolean aOk = false, bOk = false;

                    do {
                        System.out.print("First number: ");
                        String s = keyboard.readLine();
                        try {
                            a = Integer.parseInt(s);
                            aOk = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Please insert a number");
                        }
                    } while (!aOk);

                    do {
                        System.out.print("Second number: ");
                        String s = keyboard.readLine();
                        try { 
                            b = Integer.parseInt(s);
                            bOk = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Please insert a number");
                        }
                    } while (!bOk);

                    System.out.println(a + b);
                } catch (IOException ioe) {
                    System.out.println("Error while reading input");
                }
            } else {
                System.out.println("wrong or missing arguments.");
            }
            return;
        }

        SumErrors.main(args);
    }
}
