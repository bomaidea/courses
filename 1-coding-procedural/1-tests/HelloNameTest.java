import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for HelloName.
 * 
 * @author giuliobosco
 * @version 1.0 (2020-07-08 - 2020-07-08)
 */

public class HelloNameTest {
     

    @Test(expected = ArrayIndexOutOfBoundsException.class) 
    public void testWithoutArguments() {
        HelloName.main(TestUtils.E);
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