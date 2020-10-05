package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class Solution399Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("calcEquation");
        Solution399 instance = new Solution399();

        List<List<String>> equations1 = ListUtil.buildList2(new String[][]{{"a", "b"}, {"b", "c"}});
        double[] values1 = new double[] {2.0, 3.0};
        List<List<String>>  queries1 = ListUtil.buildList2(new String[][]{{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}});
        assertArrayEquals(new double[] {6,0.5,-1,1,-1}, instance.calcEquation(equations1,values1,queries1),0.0);
    }

}
