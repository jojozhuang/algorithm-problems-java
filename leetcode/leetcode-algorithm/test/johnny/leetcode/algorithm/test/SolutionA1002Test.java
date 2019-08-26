package johnny.leetcode.algorithm.test;

import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1002;
import johnny.leetcode.algorithm.common.ListUtil;

public class SolutionA1002Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("commonChars");
        SolutionA1002 instance = new SolutionA1002();

        List<String> expect1 = ListUtil.buildList(new String[] {"e","l","l"});
        List<String> result1 = instance.commonChars(new String[] {"bella","label","roller"});
        assertEquals(expect1, result1);

        List<String> expect2 = ListUtil.buildList(new String[] {"c","o"});
        List<String> result2 = instance.commonChars(new String[] {"cool","lock","cook"});
        assertEquals(expect2, result2);
    }
}
