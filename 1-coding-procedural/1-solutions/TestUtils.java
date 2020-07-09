import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Testing utility.
 * 
 * @author giuliobosco
 * @version 1.0 (2020-07-08 - 2020-07-08)
 */
public class TestUtils {

    /**
     * Empty string array.
     */
    public static final String[] E = new String[0];

    /**
     * Full string array.
     */
    public static final String[] F = new String[] {
        "Hello",
        "World"
    };

    /**
     * Static ByteArrayOutputStream for System.out.
     */
    public static ByteArrayOutputStream out;

    /**
     * Prepare System.out for testing.
     * 
     * @return System.out stream.
     */
    public static ByteArrayOutputStream prepareOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TestUtils.out = out;

        return out;
    }
}