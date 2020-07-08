/**
 * HelloNameInteractive, ask the user his name and say him hello.
 *
 * @author giuliobosco
 * @version 1.0 (2020-07-07 - 2020-07-07)
 */

import java.io.*;

public class HelloNameInteractive {
        public static void main(String[] args) {
                try {
                        InputStreamReader input = new InputStreamReader(System.in);
                        BufferedReader keyboard = new BufferedReader(input);

                        String name;
                        do {
                               name = keyboard.readLine();
                        } while (name.length() <= 0);

                        System.out.println("Hello " + name + "!");
                } catch (IOException ioe) {
                        System.out.println("Error while reading keyboard input");
                }
        }
}
