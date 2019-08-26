package johnny.leetcode.others.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.others.AAAClosestElement;

public class AAAClosestElementTest extends JunitBase {

    @Test
    public void testClosestElement() {
        System.out.println("ClosestElement");
        AAAClosestElement chocolate = new AAAClosestElement();

        assertEquals(3, chocolate.findClosestElements(new int[] {1,2,3,4,5}, 1, 3));
        assertEquals(2, chocolate.findClosestElements(new int[] {1,2,3,4,5}, 2, 3));
        assertEquals(4, chocolate.findClosestElements(new int[] {1,2,3,4,5}, 3, 3));
        assertEquals(1, chocolate.findClosestElements(new int[] {1,2,3,4,5}, 4, 3));
        assertEquals(5, chocolate.findClosestElements(new int[] {1,2,3,4,5}, 5, 3));
        assertEquals(5, chocolate.findClosestElements(new int[] {1, 3, 5, 10, 20, 23}, 2, 11));
    }
}
