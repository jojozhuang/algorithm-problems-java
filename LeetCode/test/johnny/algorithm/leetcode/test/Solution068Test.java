package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution068;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution068Test {
    
    public Solution068Test() {
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
     * Test of fullJustify method, of class Solution068.
     */
    @Test
    public void testFullJustify() {
        System.out.println("fullJustify");
        String[] words = null;
        int maxWidth = 0;
        Solution068 instance = new Solution068();
        List<String> expResult = new ArrayList<String>();
        List<String> result = instance.fullJustify(words, maxWidth);
        assertEquals(expResult, result);
        
        List<String> expResult2 = new ArrayList<String>();
        expResult2.add("This    is    an");
        expResult2.add("example  of text");
        expResult2.add("justification.  ");
        assertEquals(expResult2, instance.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
        
        List<String> expResult3 = new ArrayList<String>();
        expResult3.add("What must be");
        expResult3.add("shall be.   ");
        assertEquals(expResult3, instance.fullJustify(new String[]{"What","must","be","shall","be."}, 12));
    }
}
