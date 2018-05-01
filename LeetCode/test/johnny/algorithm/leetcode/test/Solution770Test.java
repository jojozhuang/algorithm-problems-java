package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution770;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution770Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("basicCalculatorIV");

        Solution770 instance1 = new Solution770();
        List<String> expect1 = ListUtil.buildList(new String[] {"-1*a","14"});
        assertEquals(expect1, instance1.basicCalculatorIV("e + 8 - a + 5", new String[] {"e"}, new int[] {1}));

        Solution770 instance2 = new Solution770();
        List<String> expect2 = ListUtil.buildList(new String[] {"-1*pressure","5"});
        assertEquals(expect2, instance2.basicCalculatorIV("e - 8 + temperature - pressure", new String[] {"e", "temperature"}, new int[] {1,12}));

        Solution770 instance3 = new Solution770();
        List<String> expect3 = ListUtil.buildList(new String[] {"1*e*e","-64"});
        assertEquals(expect3, instance3.basicCalculatorIV("(e + 8) * (e - 8)", new String[] {}, new int[] {}));

        Solution770 instance4 = new Solution770();
        List<String> expect4 = ListUtil.buildList(new String[] {});
        assertEquals(expect4, instance4.basicCalculatorIV("7 - 7", new String[] {}, new int[] {}));

        Solution770 instance5 = new Solution770();
        List<String> expect5 = ListUtil.buildList(new String[] {"5*a*b*c"});
        assertEquals(expect5, instance5.basicCalculatorIV("a * b * c + b * a * c * 4", new String[] {}, new int[] {}));

        Solution770 instance6 = new Solution770();
        List<String> expect6 = ListUtil.buildList(new String[] {"-1*a*a*b*b","2*a*a*b*c","-1*a*a*c*c","1*a*b*b*b","-1*a*b*b*c","-1*a*b*c*c","1*a*c*c*c","-1*b*b*b*c","2*b*b*c*c","-1*b*c*c*c","2*a*a*b","-2*a*a*c","-2*a*b*b","2*a*c*c","1*b*b*b","-1*b*b*c","1*b*c*c","-1*c*c*c","-1*a*a","1*a*b","1*a*c","-1*b*c"});
        assertEquals(expect6, instance6.basicCalculatorIV("((a - b) * (b - c) + (c - a)) * ((a - b) + (b - c) * (c - a))", new String[] {"e"}, new int[] {1}));
    }
}
