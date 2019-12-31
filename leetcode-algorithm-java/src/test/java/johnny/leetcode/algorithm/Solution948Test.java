package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution948;

public class Solution948Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("bagOfTokensScore");
        Solution948 instance = new Solution948();

        assertEquals(0, instance.bagOfTokensScore(new int[] {100}, 50));
        assertEquals(1, instance.bagOfTokensScore(new int[] {100,200}, 150));
        assertEquals(2, instance.bagOfTokensScore(new int[] {100,200,300,400}, 200));
        assertEquals(2, instance.bagOfTokensScore(new int[] {48,87,26}, 81));
        assertEquals(1, instance.bagOfTokensScore(new int[] {26}, 51));
        assertEquals(0, instance.bagOfTokensScore(new int[] {71,55,82}, 54));
    }
}