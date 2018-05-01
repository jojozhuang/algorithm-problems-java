package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution816;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution816Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("ambiguousCoordinates");
        Solution816 instance = new Solution816();

        List<String> coordinates1 = ListUtil.buildList(new String[]{"(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)"});
        List<String> expect1 = instance.ambiguousCoordinates("(123)");
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, coordinates1));

        List<String> coordinates2 = ListUtil.buildList(new String[]{"(0.001, 1)", "(0, 0.011)"});
        List<String> expect2 = instance.ambiguousCoordinates("(00011)");
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, coordinates2));

        List<String> coordinates3 = ListUtil.buildList(new String[]{"(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"});
        List<String> expect3 = instance.ambiguousCoordinates("(0123)");
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, coordinates3));

        List<String> coordinates4 = ListUtil.buildList(new String[]{"(10, 0)"});
        List<String> expect4 = instance.ambiguousCoordinates("(100)");
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, coordinates4));
    }
}
