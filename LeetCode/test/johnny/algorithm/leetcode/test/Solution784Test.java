package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution784;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution784Test {

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
        System.out.println("letterCasePermutation");
        Solution784 instance = new Solution784();

        List<String> result1 = ListUtil.buildStringList(new String[] {"a1b2", "a1B2", "A1b2", "A1B2"});
        assertTrue(ListUtil.equalLists(result1, instance.letterCasePermutation("a1b2")));
        
        List<String> result2 = ListUtil.buildStringList(new String[] {"3z4", "3Z4"});
        assertTrue(ListUtil.equalLists(result2, instance.letterCasePermutation("3z4")));
        
        List<String> result3 = ListUtil.buildStringList(new String[] {"12345"});
        assertTrue(ListUtil.equalLists(result3, instance.letterCasePermutation("12345")));
    }

}
