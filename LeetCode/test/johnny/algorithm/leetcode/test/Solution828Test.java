package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution828;

public class Solution828Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uniqueLetterString");
        Solution828 instance = new Solution828();

        assertEquals(10, instance.uniqueLetterString("ABC"));
        assertEquals(8, instance.uniqueLetterString("ABA"));
    }
}
