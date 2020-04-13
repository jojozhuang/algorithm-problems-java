package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1408Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("stringMatching");
        SolutionA1408 instance = new SolutionA1408();

        assertEquals(ListUtil.buildList(new String[]{"as","hero"}), instance.stringMatching(new String[]{"mass","as","hero","superhero"}));
        assertEquals(ListUtil.buildList(new String[]{"code","et"}), instance.stringMatching(new String[]{"leetcode","et","code"}));
        assertEquals(ListUtil.buildList(new String[]{}), instance.stringMatching(new String[]{"blue","green","bu"}));
    }
}
