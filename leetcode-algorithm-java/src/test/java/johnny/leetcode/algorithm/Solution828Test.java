package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution828;

public class Solution828Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uniqueLetterString");
        Solution828 instance = new Solution828();

        assertEquals(10, instance.uniqueLetterString("ABC"));
        assertEquals(8, instance.uniqueLetterString("ABA"));
    }
}
