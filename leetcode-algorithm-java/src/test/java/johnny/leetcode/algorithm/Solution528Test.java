package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution528Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("528. Random Pick with Weight");
        
        // test 1: only one element
        Solution528 random1 = new Solution528(new int[] {1});
        // always return 0
        assertEquals(0, random1.pickIndex());
        assertEquals(0, random1.pickIndex());
        assertEquals(0, random1.pickIndex());
        assertEquals(0, random1.pickIndex());
        
        // test 2: two elements
        Solution528 random2 = new Solution528(new int[] {1,3});
        // return 0 or 1 only
        int result2 = random2.pickIndex();
        assertEquals(true, result2 == 0 || result2 == 1);
        assertEquals(true, result2 == 0 || result2 == 1);
        assertEquals(true, result2 == 0 || result2 == 1);
        
        // test 3: four elements
        Solution528 random3 = new Solution528(new int[] {3,4,1,7}); // {3,7,8,15}
        // return 0, 1, 2, 3 only
        int result3 = random3.pickIndex();
        assertEquals(true, result3 == 0 || result3 == 1 || result3 == 2 || result3 == 3);
        assertEquals(true, result3 == 0 || result3 == 1 || result3 == 2 || result3 == 3);
        assertEquals(true, result3 == 0 || result3 == 1 || result3 == 2 || result3 == 3);
    }
}
