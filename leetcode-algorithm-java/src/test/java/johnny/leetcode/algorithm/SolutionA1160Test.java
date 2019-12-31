package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1160;

public class SolutionA1160Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countCharacters");
        SolutionA1160 instance = new SolutionA1160();

        assertEquals(6, instance.countCharacters(new String[] {"cat","bt","hat","tree"}, "atach"));
        assertEquals(10, instance.countCharacters(new String[] {"hello","world","leetcode"}, "welldonehoneyr"));
    }
}
