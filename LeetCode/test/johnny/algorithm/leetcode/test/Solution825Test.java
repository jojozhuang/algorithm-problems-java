package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution825;

public class Solution825Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("uniqueLetterString");
        Solution825 instance = new Solution825();

        assertEquals(2, instance.numFriendRequests(new int[] {16,16}));
        assertEquals(2, instance.numFriendRequests(new int[] {16,17,18}));
        assertEquals(3, instance.numFriendRequests(new int[] {20,30,100,110,120}));
    }
}
