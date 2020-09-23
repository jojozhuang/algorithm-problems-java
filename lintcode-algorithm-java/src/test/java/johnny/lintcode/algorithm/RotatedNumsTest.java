package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotatedNumsTest extends JunitBase {

    @Test
    public void testRotatedNums() {
        System.out.println("testRotatedNums");
        RotatedNums instance = new RotatedNums();

        assertEquals(5, instance.RotatedNums(1));
        assertEquals(6, instance.RotatedNums(2));
        assertEquals(2058, instance.RotatedNums(8));
    }
}
