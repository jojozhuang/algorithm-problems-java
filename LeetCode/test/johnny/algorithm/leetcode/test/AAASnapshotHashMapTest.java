package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.AAASnapshotHashMap;

public class AAASnapshotHashMapTest extends JunitBase {

    @Test
    public void testSnapshotHashMap() {
        System.out.println("SnapshotHashMap");
        AAASnapshotHashMap snapMap = new AAASnapshotHashMap();

        snapMap.put(1, 1);
        snapMap.put(2, 2);
        assertEquals(1, snapMap.get(1));            // returns 1
        assertEquals(-1, snapMap.get(3));           // returns -1 (not found)
        snapMap.put(2, 4);                          // update the existing value
        assertEquals(4, snapMap.get(2));            // returns 4 
        int id = snapMap.snapshot();
        snapMap.put(2, 3);
        assertEquals(4, snapMap.getsnap(2, id));    // returns 4 
        assertEquals(3, snapMap.get(2));            // returns 3 
        assertEquals(1, snapMap.get(1));            // returns 1, previous version

    }
}
