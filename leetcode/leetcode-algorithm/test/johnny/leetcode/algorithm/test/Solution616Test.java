package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution616;

public class Solution616Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("addBoldTag");
        Solution616 instance = new Solution616();

        assertEquals("<b>abc</b>xyz<b>123</b>", instance.addBoldTag("abcxyz123", new String[] {"abc","123"}));
        assertEquals("<b>abc</b>xyz<b>123</b>", instance.addBoldTag("abcxyz123", new String[] {"abc","123"}));
    }
}
