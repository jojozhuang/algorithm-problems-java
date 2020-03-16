package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1380Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("luckyNumbers");
        SolutionA1380 instance = new SolutionA1380();

        int[][] matrix1 = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> expect1 = ListUtil.buildList(new Integer[]{15});
        assertEquals(expect1, instance.luckyNumbers(matrix1));

        int[][] matrix2 = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> expect2 = ListUtil.buildList(new Integer[]{12});
        assertEquals(expect2, instance.luckyNumbers(matrix2));

        int[][] matrix3 = {{7,8},{1,2}};
        List<Integer> expect3 = ListUtil.buildList(new Integer[]{7});
        assertEquals(expect3, instance.luckyNumbers(matrix3));

    }
}
