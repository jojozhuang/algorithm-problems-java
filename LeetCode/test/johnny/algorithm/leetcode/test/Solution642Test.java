package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution642;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution642Test {

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
        System.out.println("AutocompleteSystem");
        
        String[] sentences1 = new String[] {"i love you", "island","ironman", "i love leetcode"};
        int[] times1 = new int[] {5,3,2,2};
        Solution642 instance = new Solution642(sentences1, times1);

        List<String> expect1 = ListUtil.buildList(new String[] {"i love you", "island","i love leetcode"});
        assertEquals(expect1, instance.input('i'));

        List<String> expect2 = ListUtil.buildList(new String[] {"i love you","i love leetcode"});
        assertEquals(expect2, instance.input(' '));

        List<String> expect3 = ListUtil.buildList(new String[] {});
        assertEquals(expect3, instance.input('a'));

        List<String> expect4 = ListUtil.buildList(new String[] {});
        assertEquals(expect4, instance.input('#'));
    }
}
