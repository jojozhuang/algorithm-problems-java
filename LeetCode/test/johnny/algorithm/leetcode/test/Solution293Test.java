package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution293;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution293Test {
    
    public Solution293Test() {
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
     * Test of generatePossibleNextMoves method, of class Solution293.
     */
    @Test
    public void testGeneratePossibleNextMoves() {
        System.out.println("generatePossibleNextMoves");
        Solution293 instance = new Solution293();
        
        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.generatePossibleNextMoves(""));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"--++","+--+","++--"});
        assertEquals(expect2, instance.generatePossibleNextMoves("++++"));
    }
}
