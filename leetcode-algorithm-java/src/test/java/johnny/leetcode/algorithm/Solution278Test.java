package johnny.leetcode.algorithm;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class Solution278Test extends JunitBase {

    @Test
    public void testFirstBadVersion() {
        System.out.println("firstBadVersion");
        Solution278 instance = new Solution278();

        assertEquals(0, instance.firstBadVersion(0));

        HashMap<Integer, Boolean> map1 = new HashMap<Integer, Boolean>();
        map1.put(1, true);
        map1.put(2, true);
        instance.setMap(map1);
        assertEquals(1, instance.firstBadVersion(2));

        HashMap<Integer, Boolean> map2 = new HashMap<Integer, Boolean>();
        map2.put(1, false);
        map2.put(2, true);
        instance.setMap(map2);
        assertEquals(2, instance.firstBadVersion(2));

        HashMap<Integer, Boolean> map3 = new HashMap<Integer, Boolean>();
        map3.put(1, false);
        map3.put(2, false);
        map3.put(3, false);
        map3.put(4, true);
        map3.put(5, true);
        map3.put(6, true);
        map3.put(7, true);
        map3.put(8, true);
        instance.setMap(map3);
        assertEquals(4, instance.firstBadVersion(8));
    }
}
