package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution428Test extends JunitBase {
    
    @Test
    public void testSerialize() {
        System.out.println("serialize");
        Solution428 instance = new Solution428();

        assertEquals("", instance.serialize(null));

        Solution428.Node root2 = instance.deserialize("1,0");
        assertEquals("1,0", instance.serialize(root2));

        Solution428.Node root3 = instance.deserialize("1,1,4,0");
        assertEquals("1,1,4,0", instance.serialize(root3));

        Solution428.Node root4 = instance.deserialize("1,2,2,0,3,0");
        assertEquals("1,2,2,0,3,0", instance.serialize(root4));

        Solution428.Node root5 = instance.deserialize("1,3,3,2,5,0,6,0,2,0,4,0");
        assertEquals("1,3,3,2,5,0,6,0,2,0,4,0", instance.serialize(root5));
    }
}
