package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FeatureExtractionTest extends JunitBase {

    @Test
    public void testFeatureExtraction() {
        System.out.println("testFeatureExtraction");

        FeatureExtraction instance = new FeatureExtraction();

        int[][] frames1 = new int[][] {
            {2,1,1,2,2},
            {2,1,1,1,4},
            {2,1,1,2,2},
            {2,2,2,1,4},
            {0},
            {0},
            {1,1,1},
            {1,1,1}
        };

        assertEquals(3, instance.FeatureExtraction(frames1));
    }
}
