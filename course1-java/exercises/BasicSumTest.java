/**
 * Tests for BasicSum, check the right execution of the code.
 * @author giuliobosco
 * @version 1.0 (2020-07-08 - 2020-07-08)
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicSumTest {
    
    private final String EXPECTED = "The sum of the following two values 1, 2 is 3.\n";

    @Test
    public void testWithoutArguments() {
        TestUtils.prepareOut();

        BasicSum.main(TestUtils.E);

        assertEquals(EXPECTED, TestUtils.out.toString());
    }

    @Test
    public void testWithArguments() {
        TestUtils.prepareOut();

        BasicSum.main(TestUtils.F);

        assertEquals(EXPECTED, TestUtils.out.toString());
    }
}
