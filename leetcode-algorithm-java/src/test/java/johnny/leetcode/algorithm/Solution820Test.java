package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution820Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minimumLengthEncoding");
        Solution820 instance = new Solution820();

        assertEquals(10, instance.minimumLengthEncoding(new String[] {"time", "me", "bell"}));
    }
}
