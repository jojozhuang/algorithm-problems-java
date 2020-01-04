package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution157Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("read");
        Solution157 instance = new Solution157();

        assertEquals(0, instance.read(new char[] {}, 2));
    }
}
