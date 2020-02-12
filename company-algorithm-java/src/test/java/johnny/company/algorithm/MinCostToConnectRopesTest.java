package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinCostToConnectRopesTest extends JunitBase {

    @Test
    public void testMergeRopes() {
        System.out.println("mergeRopes");
        MinCostToConnectRopes instance = new MinCostToConnectRopes();

        assertEquals(58, instance.mergeRopes(new int[]{8, 4, 6, 12}));
        assertEquals(54, instance.mergeRopes(new int[]{20, 4, 8, 2}));
        assertEquals(224, instance.mergeRopes(new int[]{1, 2, 5, 10, 35, 89}));
        assertEquals(20, instance.mergeRopes(new int[]{2, 2, 3, 3}));
    }
}
