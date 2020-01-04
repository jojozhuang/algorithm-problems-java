package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution158Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("read");
        Solution158 instance = new Solution158();

        assertEquals(0, instance.read(new char[] {}, 2));
    }
}
