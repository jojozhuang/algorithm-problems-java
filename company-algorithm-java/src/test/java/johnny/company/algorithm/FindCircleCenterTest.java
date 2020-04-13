package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindCircleCenterTest extends JunitBase {

    @Test
    public void test() {
        System.out.println("circleCenter");
        FindCircleCenter instance = new FindCircleCenter();

        // https://www.geogebra.org/classic/ynd5gggb
        double[] result1 = instance.circleCenter(1,-4, -3,5,4,5);
        assertEquals(0.5, result1[0], 0.01);
        assertEquals(1.167, result1[1], 0.01);

        double[] result2 = instance.circleCenter(10,2, 1,-4,4,5);
        assertEquals(5.07, result2[0], 0.01);
        assertEquals(-0.36, result2[1], 0.01);
    }
}
