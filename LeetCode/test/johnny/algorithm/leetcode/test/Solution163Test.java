package johnny.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution163;
import johnny.algorithm.leetcode.common.ListUtil;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution163Test {
    
    public Solution163Test() {
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
     * Test of findMissingRanges method, of class Solution163.
     */
    @Test
    public void testFindMissingRanges() {
        System.out.println("findMissingRanges");
        Solution163 instance = new Solution163();
        
        List<String> expect1 = ListUtil.buildList(new String[] {"0"});
        assertEquals(expect1, instance.findMissingRanges(null, 0, 0));
        
        List<String> result2 = instance.findMissingRanges(new int[]{1,2}, 1, 2);
        List<String> expect2 = ListUtil.buildList(new String[] {});
        assertEquals(expect2, result2);
        
        List<String> result3 = instance.findMissingRanges(new int[]{1,2}, 0, 3);
        List<String> expect3 = ListUtil.buildList(new String[] {"0","3"});
        assertEquals(expect3, result3);
        
        List<String> result4 = instance.findMissingRanges(new int[]{1,2}, 1, 4);
        List<String> expect4 = ListUtil.buildList(new String[]{"3->4"});
        assertEquals(expect4, result4);
        
        List<String> result5 = instance.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99);
        List<String> expect5 = ListUtil.buildList(new String[]{"2","4->49","51->74","76->99"});
        assertEquals(expect5, result5);
        
        List<String> result6 = instance.findMissingRanges(new int[]{3, 50, 75}, 0, 99);
        List<String> expect6 = ListUtil.buildList(new String[]{"0->2","4->49","51->74","76->99"});
        assertEquals(expect6, result6);
        
        List<String> result7 = instance.findMissingRanges(new int[]{}, 1, 1);
        List<String> expect7 = ListUtil.buildList(new String[]{"1"});
        assertEquals(expect7, result7);

        List<String> result8 = instance.findMissingRanges(new int[]{Integer.MAX_VALUE}, 0, Integer.MAX_VALUE);
        List<String> expect8 = ListUtil.buildList(new String[]{"0->2147483646"});
        assertEquals(expect8, result8);

        List<String> result9 = instance.findMissingRanges(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE}, Integer.MIN_VALUE, Integer.MAX_VALUE);
        //List<String> result9 = instance.findMissingRanges(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, Integer.MIN_VALUE, Integer.MAX_VALUE);
        List<String> expect9 = ListUtil.buildList(new String[]{"-2147483647->-1","1->2147483646"});
        assertEquals(expect9, result9);
        
        List<String> result10 = instance.findMissingRanges(new int[]{Integer.MIN_VALUE}, Integer.MIN_VALUE, Integer.MAX_VALUE);
        List<String> expect10 = ListUtil.buildList(new String[]{"-2147483647->2147483647"});
        assertEquals(expect10, result10);
    }
    
}
