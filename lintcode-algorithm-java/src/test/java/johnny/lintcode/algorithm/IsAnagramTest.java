package johnny.lintcode.algorithm;

import johnny.algorithm.common.TreeNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class IsAnagramTest {

    public IsAnagramTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

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
