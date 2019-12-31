package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.SolutionA1178;
import johnny.leetcode.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1178Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findNumOfValidWords");
        SolutionA1178 instance = new SolutionA1178();

        List<Integer> expect1 = ListUtil.buildList(new Integer[]{1,1,3,2,4,0});
        //assertEquals(expect1, instance.findNumOfValidWords(new String[]{"aaaa","asas","able","ability","actt","actor","access"}, new String[]{"abslute","absoryz","actresz","gaswxyz"}));
        assertEquals(expect1, instance.findNumOfValidWords(new String[]{"aaaa","asas","able","ability","actt","actor","access"}, new String[]{"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"}));
    }
}
