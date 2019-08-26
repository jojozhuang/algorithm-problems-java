package johnny.leetcode.others.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.others.AAASplitChocolate;

public class AAASplitChocolateTest extends JunitBase {

    @Test
    public void testSplitChocolate() {
        System.out.println("SplitChocolate");
        AAASplitChocolate chocolate = new AAASplitChocolate();
        
        assertEquals(14, chocolate.splitArray(new int[] {7, 2, 5, 10, 8}, 2));
        
        assertEquals(4, chocolate.splitArray(new int[] {3, 2, 3, 1, 4}, 3));
        assertEquals(6, chocolate.splitArray(new int[] {3, 4, 5, 5, 6}, 3));
        assertEquals(5, chocolate.splitArray(new int[] {3, 4, 5, 5, 6}, 4));
        
        assertEquals(5, chocolate.splitArray(new int[] {5, 5, 6, 7, 8, 9, 9, 5}, 8));
        assertEquals(5, chocolate.splitArray(new int[] {5, 5, 6, 7, 8, 9, 9, 5}, 7));
        assertEquals(54, chocolate.splitArray(new int[] {5, 5, 6, 7, 8, 9, 9, 5}, 1));
        
        assertEquals(8, chocolate.splitArray(new int[] {5, 3, 4, 4}, 2));
        assertEquals(4, chocolate.splitArray(new int[] {5, 3, 4, 4}, 3));
        assertEquals(4, chocolate.splitArray(new int[] {4, 4, 4, 4}, 4));
    }
}
