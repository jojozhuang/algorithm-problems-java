package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution269Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("alienOrder");
        Solution269 instance = new Solution269();

        assertEquals("wertf", instance.alienOrder(new String[] {"wrt","wrf","er","ett","rftt"}));
        assertEquals("zx", instance.alienOrder(new String[] {"z","x"}));
        assertEquals("", instance.alienOrder(new String[] {"z","x","z"}));
        //assertEquals("", instance.alienOrder(new String[] {"wrtkj","wrt"}));
        assertEquals("", instance.alienOrder(new String[] {"ri","xz","qxf","jhsguaw","dztqrbwbm","dhdqfb","jdv","fcgfsilnb","ooby"}));
    }
}
