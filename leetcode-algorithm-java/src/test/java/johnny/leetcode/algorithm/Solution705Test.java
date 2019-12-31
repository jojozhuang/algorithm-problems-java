package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution705;

public class Solution705Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("HashSet");
        Solution705 hashSet = new Solution705();

        hashSet.add(1);
        hashSet.add(2);
        assertEquals(true, hashSet.contains(1));     // returns true
        assertEquals(false, hashSet.contains(3));    // returns false (not found)
        hashSet.add(2);
        assertEquals(true, hashSet.contains(2));     // returns true
        hashSet.remove(2);
        assertEquals(false, hashSet.contains(2));    // returns false (already removed)
    }
}
