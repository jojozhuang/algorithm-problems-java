package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class HashFunctionTest extends JunitBase {

    /**
     * Test of hashCode method, of class HashFunction.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        char[] key = null;
        int HASH_SIZE = 0;
        HashFunction instance = new HashFunction();
        int expResult = 0;
        int result = instance.hashCode(key, HASH_SIZE);
        assertEquals(expResult, result);
        
        assertEquals(78, instance.hashCode("abcd".toCharArray(), 100));
    }
}
