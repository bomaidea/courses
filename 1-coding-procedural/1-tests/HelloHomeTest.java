
import org.junit.Test;
import static org.junit.Assert.*; 

/**
 * Tests for HelloHome.
 * 
 * @author giuliobosco
 * @version 1.0 (2020-07-08 - 2020-07-08)
 */
public class HelloHomeTest {

    /**
     * Expected string.
     */
    private final String EXPECTED = "  /\\\n" +
        " /  \\\n" + 
        "/    \\\n" + 
        "------\n" + 
        "| [] |\n" + 
        "|    |\n" + 
        "| [] |\n";

    /**
     * Test HelloHome without arguments.
     */
    @Test
    public void testWithoutArguments() {
        TestUtils.prepareOut();

        HelloHome.main(TestUtils.E);

        assertEquals(EXPECTED, TestUtils.out.toString());
    }

    /**
     * Test HelloHome with arguments.
     */
    @Test 
    public void testWithArguments() {
        TestUtils.prepareOut();

        HelloHome.main(TestUtils.F);

        assertEquals(EXPECTED, TestUtils.out.toString());
    }
}
