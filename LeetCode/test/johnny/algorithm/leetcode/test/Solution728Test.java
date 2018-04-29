package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution728;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution728Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("selfDividingNumbers");
        Solution728 instance = new Solution728();
        List<Integer> expResult = ListUtil.buildList(new Integer[] {1,2,3,4,5,6,7,8,9});
        List<Integer> result = instance.selfDividingNumbers(1,9);
        assertEquals(expResult, result);
        
        List<Integer> expResult2 = ListUtil.buildList(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22});
        List<Integer> result2 = instance.selfDividingNumbers(1,22);
        assertEquals(expResult2, result2);
    }

}
