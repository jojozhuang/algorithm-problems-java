package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution187;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution187Test {
    
    public Solution187Test() {
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
     * Test of findRepeatedDnaSequences method, of class Solution187.
     */
    @Test
    public void testFindRepeatedDnaSequences() {
        System.out.println("findRepeatedDnaSequences");
        Solution187 instance = new Solution187();
        
        List<String> expect1 = new ArrayList<>();
        assertEquals(expect1, instance.findRepeatedDnaSequences(""));
        
        List<String> expect2 = ListUtil.buildList(new String[] {"AAAAACCCCC","CCCCCAAAAA"});
        assertEquals(expect2,  instance.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        
        List<String> expect3 = ListUtil.buildList(new String[] {"AAAAACCCCC"});
        assertEquals(expect3,  instance.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCTTTTTGGGTTT"));
    }
}
