package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1160Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countCharacters");
        SolutionA1160 instance = new SolutionA1160();

        assertEquals(6, instance.countCharacters(new String[] {"cat","bt","hat","tree"}, "atach"));
        assertEquals(10, instance.countCharacters(new String[] {"hello","world","leetcode"}, "welldonehoneyr"));
    }
}
