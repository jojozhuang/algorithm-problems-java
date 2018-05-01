package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution800;

public class Solution800Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("similarRGB");
        Solution800 instance = new Solution800();

        assertEquals("#11ee66", instance.similarRGB("#09f166"));
    }
}
