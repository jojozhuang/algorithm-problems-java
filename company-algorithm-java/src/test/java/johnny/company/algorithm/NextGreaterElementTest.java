package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextGreaterElementTest extends JunitBase {

    @Test
    public void test() {
        System.out.println("NextGreaterElement");
        NextGreaterElement instance = new NextGreaterElement();

        assertArrayEquals(new int[]{5, 5, 12, -1, -1}, instance.nextGreaterElements(new int[]{4, 2, 5, 12,3}));
        assertArrayEquals(new int[]{-1}, instance.nextGreaterElements(new int[]{1}));
        assertArrayEquals(new int[]{2, 3, 4, 5, -1}, instance.nextGreaterElements(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{-1, -1, -1, -1, -1}, instance.nextGreaterElements(new int[]{5, 4, 3, 2,1}));
    }
}
