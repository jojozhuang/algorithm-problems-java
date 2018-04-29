package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution017;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution017Test {
    
    public Solution017Test() {
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
     * Test of letterCombinations method, of class Solution017.
     */
    @Test
    public void testLetterCombinations() {
        System.out.println("letterCombinations");
        Solution017 instance = new Solution017();
        
        List<String> expect1 = ListUtil.buildList(new String[] {});
        assertEquals(expect1, instance.letterCombinations(""));
        
        List<String> expect2 = ListUtil.buildList(new String[] {});
        assertEquals(expect2, instance.letterCombinations("1"));
        
        List<String> expect3 = ListUtil.buildList(new String[] {"a","b","c"});
        assertEquals(expect3, instance.letterCombinations("2"));
        
        List<String> expect4 = ListUtil.buildList(new String[] {"ad","ae","af","bd","be","bf","cd","ce","cf"});
        assertEquals(expect4, instance.letterCombinations("23"));
    }
    
}
