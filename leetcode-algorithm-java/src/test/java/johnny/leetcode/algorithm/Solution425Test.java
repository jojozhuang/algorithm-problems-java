package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution425;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution425Test extends JunitBase {

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
