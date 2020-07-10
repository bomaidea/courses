import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for HelloVars.
 *
 * @author giuliobosco
 * @version 1.0 (2020-07-10 - 2020-07-10)
 */
public class HelloVarsTest {
   
    private final String EXPECTED = "false is boolean\ntrue changed\n" + 
            Byte.MAX_VALUE + " is byte\n" + Byte.MIN_VALUE + " changed\n" + 
            Short.MAX_VALUE + " is short\n" + Short.MIN_VALUE + " changed\n" +
            Integer.MAX_VALUE + " is int\n" + Integer.MIN_VALUE + " changed\n" +
            Long.MAX_VALUE + " is long\n" + Long.MIN_VALUE + " changed\n" +
            Float.MAX_VALUE + " is float\n" + Float.MIN_VALUE + " changed\n" +
            Double.MAX_VALUE + " is double\n" + Double.MIN_VALUE + " changed\n" +
            "c is char\nd changed\n";

    @Test
    public void testHelloVars() {
        TestUtils.prepareOut();

        HelloVars.main(TestUtils.E);

        assertEquals(EXPECTED, TestUtils.out.toString());
    }
}
