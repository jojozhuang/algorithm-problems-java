package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution917Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isLongPressedName");
        Solution917 instance = new Solution917();

        assertEquals("dc-ba", instance.reverseOnlyLetters("ab-cd"));
        assertEquals("j-Ih-gfE-dCba", instance.reverseOnlyLetters("a-bC-dEf-ghIj"));
        assertEquals("Qedo1ct-eeLg=ntse-T!", instance.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        assertEquals("7_28]", instance.reverseOnlyLetters("7_28]"));
    }
}
