package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution903;

public class Solution903Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numPermsDISequence");
        Solution903 instance = new Solution903();

        assertEquals(5, instance.numPermsDISequence("DID"));
    }
}
