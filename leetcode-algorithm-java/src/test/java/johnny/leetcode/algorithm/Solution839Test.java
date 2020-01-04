package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution839Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSimilarGroups");
        Solution839 instance = new Solution839();

        assertEquals(2, instance.numSimilarGroups(new String[] {"tars","rats","arts","star"}));
    }
}
