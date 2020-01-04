package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution709Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("toLowerCase");
        Solution709 instance = new Solution709();

        assertEquals("", instance.toLowerCase(""));
        assertEquals("z", instance.toLowerCase("Z"));
        assertEquals("hello", instance.toLowerCase("Hello"));
        assertEquals("here", instance.toLowerCase("here"));
        assertEquals("lovely", instance.toLowerCase("LOVELY"));
        assertEquals("al&phabet", instance.toLowerCase("al&phaBET"));
        
    }
}
