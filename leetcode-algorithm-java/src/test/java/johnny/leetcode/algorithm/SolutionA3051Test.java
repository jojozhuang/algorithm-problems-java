package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3051Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containsPattern");
        SolutionA3051 instance = new SolutionA3051();

        assertEquals("azs", instance.modifyString("?zs"));
        assertEquals("ubvaw", instance.modifyString("ubv?w"));
        assertEquals("jaqgacb", instance.modifyString("j?qg??b"));
        assertEquals("abywaipkja", instance.modifyString("??yw?ipkj?"));

    }
}
