package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution638;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution638Test {

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
        System.out.println("shoppingOffers");
        Solution638 instance = new Solution638();

        List<Integer> price1 = ListUtil.buildList(new Integer[] {2,5}); 
        List<List<Integer>> special1 = ListUtil.buildList2(new Integer[][] {{3,0,5},{1,2,10}});
        List<Integer> needs1 = ListUtil.buildList(new Integer[] {3,2});
        assertEquals(14, instance.shoppingOffers(price1, special1, needs1));
        
        List<Integer> price2 = ListUtil.buildList(new Integer[] {2,3,4}); 
        List<List<Integer>> special2 = ListUtil.buildList2(new Integer[][] {{1,1,0,4},{2,2,1,9}});
        List<Integer> needs2 = ListUtil.buildList(new Integer[] {1,2,1});
        assertEquals(11, instance.shoppingOffers(price2, special2, needs2));

    }

}
