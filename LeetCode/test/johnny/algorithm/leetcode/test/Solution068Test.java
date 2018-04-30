package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution068;
import johnny.algorithm.leetcode.common.ListUtil;

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
        Solution068 instance = new Solution068();
        
        List<String> expect2 = ListUtil.buildList(new String[] {});
        assertEquals(expect2, instance.fullJustify(null, 0));
        
        List<String> expect3 = ListUtil.buildList(new String[] {"This    is    an","example  of text","justification.  "}); 
        assertEquals(expect3, instance.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
        
        List<String> expect4 = ListUtil.buildList(new String[] {"What must be","shall be.   "});
        assertEquals(expect4, instance.fullJustify(new String[]{"What","must","be","shall","be."}, 12));
    }
}
