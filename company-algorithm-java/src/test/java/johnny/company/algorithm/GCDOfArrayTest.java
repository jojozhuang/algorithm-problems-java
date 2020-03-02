package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDOfArrayTest extends JunitBase {

    @Test
    public void testCriticalConnections() {
        System.out.println("criticalConnections");
        GCDOfArray instance = new GCDOfArray();

        int[] arr1 = new int[]{2,4,6,8,10};
        assertEquals(2, instance.generalizedGCD(5, arr1));

        int[] arr2 = new int[]{2,3,6,8,10};
        assertEquals(1, instance.generalizedGCD(5, arr2));

        int[] arr3 = new int[]{2,3,4,5,6};
        assertEquals(1, instance.generalizedGCD(5, arr3));

        int[] arr4 = new int[]{3,3,6,9,6};
        assertEquals(3, instance.generalizedGCD(5, arr4));

    }
}
