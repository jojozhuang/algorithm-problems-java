package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1189Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxNumberOfBalloons");
        SolutionA1189 instance = new SolutionA1189();
        assertEquals(1, instance.maxNumberOfBalloons("nlaebolko"));
        assertEquals(2, instance.maxNumberOfBalloons("loonbalxballpoon"));
        assertEquals(0, instance.maxNumberOfBalloons("leetcode"));
    }
}
