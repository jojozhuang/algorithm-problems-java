package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution903Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numPermsDISequence");
        Solution903 instance = new Solution903();

        assertEquals(5, instance.numPermsDISequence("DID"));
    }
}
