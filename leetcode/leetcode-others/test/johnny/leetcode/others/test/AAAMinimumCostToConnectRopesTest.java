package johnny.leetcode.others.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.others.AAAMinimumCostToConnectRopes;

public class AAAMinimumCostToConnectRopesTest extends JunitBase {

    @Test
    public void testConnectRopse() {
        System.out.println("testConnectRopse");
        AAAMinimumCostToConnectRopes rope = new AAAMinimumCostToConnectRopes();
        
        assertEquals(29, rope.connect(new int[] {4,3,2,6}));
        assertEquals(58, rope.connect(new int[] {8,4,6,12}));
    }
}
