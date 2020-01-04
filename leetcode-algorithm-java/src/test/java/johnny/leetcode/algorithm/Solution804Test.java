package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution804Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uniqueMorseRepresentations");
        Solution804 instance = new Solution804();

        assertEquals(2, instance.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));
    }
}
