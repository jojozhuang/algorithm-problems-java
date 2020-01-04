package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionA1078Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findOcurrences");
        SolutionA1078 instance = new SolutionA1078();

        assertArrayEquals(new String[]{"girl","student"},instance.findOcurrences("alice is a good girl she is a good student", "a", "good"));
        assertArrayEquals(new String[]{"we","rock"},instance.findOcurrences("we will we will rock you", "we", "will"));

        
       
    }
}
