package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution839;

public class Solution839Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSimilarGroups");
        Solution839 instance = new Solution839();

        assertEquals(2, instance.numSimilarGroups(new String[] {"tars","rats","arts","star"}));
    }
}
