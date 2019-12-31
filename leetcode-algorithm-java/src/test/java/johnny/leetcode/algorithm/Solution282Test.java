package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution282;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution282Test extends JunitBase {

    @Test
    public void testAddOperators() {
        System.out.println("addOperators");
        Solution282 instance = new Solution282();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.addOperators("", 0));

        List<String> expect2 = ListUtil.buildList(new String[] {"1+2+3","1*2*3"});
        assertEquals(expect2, instance.addOperators("123", 6));

        List<String> expect3 = ListUtil.buildList(new String[] {"2+3*2","2*3+2"});
        assertEquals(expect3, instance.addOperators("232", 8));

        List<String> expect4 = ListUtil.buildList(new String[] {"1*0+5","10-5"});
        assertEquals(expect4, instance.addOperators("105", 5));

        List<String> expect5 = ListUtil.buildList(new String[] {"0+0","0-0","0*0"});
        assertEquals(expect5, instance.addOperators("00", 0));

        List<String> expect6 = new ArrayList<String>();
        assertEquals(expect6, instance.addOperators("3456237490", 9191));
    }
}
