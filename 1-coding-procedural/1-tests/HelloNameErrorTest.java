import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for HelloNameError.
 * 
 * @author giuliobosco
 * @version 1.0 (2020-07-08 - 2020-07-08)
 */

public class HelloNameErrorTest {
     
    @Test
    public void testWithoutArguments() {
        TestUtils.prepareOut();

        String expected = "Insert your name as parameter.";

        HelloName.main(TestUtils.E);

        assertEquals(expected, TestUtils.out.toString());
    }

    @Test
    public void testWithOneArgument() {
        TestUtils.prepareOut();

        String name = "String";
        String[] args = new String[] {name};
        
        String expected = "Hello " + name + "!\n";

        HelloName.main(args);

        assertEquals(expected, TestUtils.out.toString());
    }

    @Test
    public void testWithTwoArgs() {
        TestUtils.prepareOut();

        String expected = "Hello " + TestUtils.F[0] + "!\n";

        HelloName.main(TestUtils.F);

        assertEquals(expected, TestUtils.out.toString());
    }
}
