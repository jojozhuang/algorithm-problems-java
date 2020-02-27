package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class BinaryRepresentationTest extends JunitBase {

    /**
     * Test of binaryRepresentation method, of class BinaryRepresentation.
     */
    @Test
    public void testBinaryRepresentation() {
        System.out.println("binaryRepresentation");
        String n = "";
        BinaryRepresentation instance = new BinaryRepresentation();
        String expResult = "";
        String result = instance.binaryRepresentation(n);
        assertEquals(expResult, result);
        
        assertEquals("11.1", instance.binaryRepresentation("3.5"));
        assertEquals("ERROR", instance.binaryRepresentation("3.72"));
        assertEquals("1", instance.binaryRepresentation("1.0"));
    }
    
}
