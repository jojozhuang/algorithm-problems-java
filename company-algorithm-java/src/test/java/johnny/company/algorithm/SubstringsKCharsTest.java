package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstringsKCharsTest extends JunitBase {

    @Test
    public void testSubstringsKChars() {
        System.out.println("substringsKChars");
        SubstringsKChars instance = new SubstringsKChars();

        assertEquals(7, instance.substringsKChars("pqpqs", 2));
        assertEquals(0, instance.substringsKChars("aabab", 3));

    }
}
