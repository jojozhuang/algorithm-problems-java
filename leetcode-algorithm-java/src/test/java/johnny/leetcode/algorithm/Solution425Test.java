package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
