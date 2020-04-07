package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeLongestPathWithSameValueTest extends JunitBase {

    @Test
    public void testLongestPathWithSameValue() {
        System.out.println("LongestPathWithSameValue");
        TreeLongestPathWithSameValue instance = new TreeLongestPathWithSameValue();

        assertEquals(2, instance.LongestPathWithSameValue(new int[]{1, 1, 1 ,2, 2}, new int[]{1, 2, 1, 3, 2, 4, 2, 5}));
        assertEquals(2, instance.LongestPathWithSameValue(new int[]{1, 2, 1 ,2, 2}, new int[]{1, 2, 1, 3, 2, 4, 2, 5}));
    }
    
}
