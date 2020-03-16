package johnny.company.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DotProductTest extends JunitBase {

    @Test
    public void test() {
        // [(1,4), (3,1), (2,2)]
        // [(2,3), (1,2), (3,2)]
        System.out.println("cellCompete");
        DotProduct instance = new DotProduct();

        int[][] vector11 = new int[][]{{1,4}, {3,1}, {2,2}};
        int[][] vector12 = new int[][]{{2,3}, {1,2}, {3,2}};
        assertEquals(22, instance.dotProduct(vector11, vector12));
    }
}
