package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindKClosestElementsTest extends JunitBase {

    @Test
    public void testMergeRopes() {
        System.out.println("mergeRopes");
        FindKClosestElements instance = new FindKClosestElements();

        /*assertArrayEquals(new int[]{1, 2, 3}, instance.kClosestNumbers(new int[]{1, 2, 3}, 0, 3));
        assertArrayEquals(new int[]{3, 2, 1}, instance.kClosestNumbers(new int[]{1, 2, 3}, 4, 3));
        assertArrayEquals(new int[]{2, 1, 3}, instance.kClosestNumbers(new int[]{1, 2, 3}, 2, 3));
        assertArrayEquals(new int[]{4, 1, 6}, instance.kClosestNumbers(new int[]{1, 4, 6, 8}, 3, 3));
        assertArrayEquals(new int[]{}, instance.kClosestNumbers(new int[]{1,2,4,5,6,7,8,10}, 5, 0));
        assertArrayEquals(new int[]{12,8,16,4}, instance.kClosestNumbers(new int[]{1,4,8,12,16,28,38}, 12, 4));*/
        assertArrayEquals(new int[]{25,35,15,45,10,50,1}, instance.kClosestNumbers(new int[]{1,10,15,25,35,45,50,59}, 30, 7));
    }
}
