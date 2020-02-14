package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxOfMinAltitudesTest extends JunitBase {

    @Test
    public void testMaxMinPath() {
        System.out.println("maxMinPath");
        MaxOfMinAltitudes instance = new MaxOfMinAltitudes();

        int[][] matrix1 = new int[][] {
            {5,1},
            {4,5}
        };
        assertEquals(4, instance.maxMinPath(matrix1));

        int[][] matrix2 = new int[][] {
            {1,2,3},
            {4,5,1}
        };
        assertEquals(4, instance.maxMinPath(matrix2));

        int[][] matrix3 = new int[][] {{}};
        assertEquals(0, instance.maxMinPath(matrix3));

        int[][] matrix4 = new int[][] {
            {1,2},
            {3,4},
            {5,6},
        };
        assertEquals(3, instance.maxMinPath(matrix4));
    }
}
