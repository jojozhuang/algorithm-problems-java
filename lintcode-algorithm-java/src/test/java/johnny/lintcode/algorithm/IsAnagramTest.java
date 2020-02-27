package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class IsAnagramTest extends JunitBase {

    /**
     * Test of isAnagram method, of class IsAnagram.
     */
    @Test
    public void testIsAnagram() {
        System.out.println("testIsAnagram");

        IsAnagram instance = new IsAnagram();
        assertEquals(true, instance.isAnagram("a", "a"));
        assertEquals(false, instance.isAnagram("a", "b"));
        assertEquals(false, instance.isAnagram("a", "aa"));
        assertEquals(true, instance.isAnagram("ab", "ba"));
        assertEquals(true, instance.isAnagram("anagram", "nagaram"));

    }
}
