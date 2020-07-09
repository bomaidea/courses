import java.io.ByteArrayOutputStream;

import org.junit.Test;
import static org.junit.Assert.*; 

public class HelloWorldTest {

    @Test
    public void testHelloWolrd() {
        ByteArrayOutputStream out = TestUtils.prepareOut();

        HelloWorld.main(new String[0]);

        String expected = "Hello World!\n";

        assertEquals(expected, out.toString());
    }
}
