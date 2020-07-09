import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for BasicSum, check the right execution of the code.
 * @author giuliobosco
 * @version 1.0 (2020-07-08 - 2020-07-08)
 */
public class BasicSumTest {
    
    /**
     * Expected string.
     */
    private final String EXPECTED = "The sum of the following two values 1, 2 is 3.\n";

    /**
     * Test Basic sum without arguments.
     */
    @Test
    public void testWithoutArguments() {
        TestUtils.prepareOut();

        BasicSum.main(TestUtils.E);

        assertEquals(EXPECTED, TestUtils.out.toString());
    }

    /**
     * Test basic sum with arguments.
     */
    @Test
    public void testWithArguments() {
        TestUtils.prepareOut();

        BasicSum.main(TestUtils.F);

        assertEquals(EXPECTED, TestUtils.out.toString());
    }
}
