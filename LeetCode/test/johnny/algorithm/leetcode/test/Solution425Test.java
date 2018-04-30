package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution425;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution425Test {

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
        System.out.println("wordSquares");
        Solution425 instance = new Solution425();
        
        String[] words1 = new String[] {"area","lead","wall","lady","ball"};
        List<List<String>> expect1 = ListUtil.buildList2(new String[][] {
            { "wall",
              "area",
              "lead",
              "lady"
            },
            { "ball",
              "area",
              "lead",
              "lady"
            }
        });
        assertEquals(expect1, instance.wordSquares(words1));
        
        String[] words2 = new String[] {"abat","baba","atan","atal"};
        List<List<String>> expect2 = ListUtil.buildList2(new String[][] {
            { "baba",
              "abat",
              "baba",
              "atan"
            },
            { "baba",
              "abat",
              "baba",
              "atal"
            }
        });
        assertEquals(expect2, instance.wordSquares(words2));
    }
}
