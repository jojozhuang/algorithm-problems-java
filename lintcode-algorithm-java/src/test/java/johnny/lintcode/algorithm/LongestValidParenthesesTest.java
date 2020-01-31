package johnny.lintcode.algorithm;

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
public class LongestValidParenthesesTest {

    public LongestValidParenthesesTest() {
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
     * Test of longestValidParentheses method, of class LongestValidParentheses.
     */
    @Test
    public void testLongestValidParentheses() {
        System.out.println("longestValidParentheses");
        LongestValidParentheses instance = new LongestValidParentheses();

        assertEquals(2, instance.longestValidParentheses("(()"));
        assertEquals(4, instance.longestValidParentheses(")()())"));
        assertEquals(4, instance.longestValidParentheses(")()())()()("));
    }
}
