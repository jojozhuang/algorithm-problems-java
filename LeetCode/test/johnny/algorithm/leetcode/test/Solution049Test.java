package johnny.algorithm.leetcode.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution049;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution049Test {
    
    public Solution049Test() {
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
     * Test of anagrams method, of class Solution049.
     */
    @Test
    public void testGroupAnagrams() {
        System.out.println("groupAnagrams");
        Solution049 instance = new Solution049();
        
        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {}); 
        assertEquals(expect1, instance.groupAnagrams(null));
        
        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {{"abc"}}); 
        assertEquals(expect2, instance.groupAnagrams(new String[]{"abc"}));
        
        List<List<String>> expect3 = ListUtil.buildList2(new String[][] {{"abc","cba"}});
        assertEquals(expect3, instance.groupAnagrams(new String[] {"abc","cba"}));
        
        List<List<String>> expect4 = ListUtil.buildList2(new String[][] {{"abc","cba"},{"def"}});
        assertEquals(expect4, instance.groupAnagrams(new String[] {"abc","def","cba"}));
        
        List<List<String>> expect5 = ListUtil.buildList2(new String[][] {{"abc"},{"def"},{"eba"}});
        assertEquals(expect5, instance.groupAnagrams(new String[] {"abc","def","eba"}));
        
        List<List<String>> expect6 = ListUtil.buildList2(new String[][] {{"ate","eat","tea"},{"nat","tan"},{"bat"}});
        assertTrue(ListUtil.equalsIgnoreOrder(expect6, instance.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"})));
    }
}
