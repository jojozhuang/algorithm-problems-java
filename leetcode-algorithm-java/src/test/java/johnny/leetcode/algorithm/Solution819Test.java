package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution819;

public class Solution819Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("mostCommonWord");
        Solution819 instance = new Solution819();

        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = {"hit"};
        assertEquals("ball", instance.mostCommonWord(paragraph1, banned1));
        
        String[] banned2 = {""};
        assertEquals("bob", instance.mostCommonWord("Bob", banned2));

        String[] banned3 = {"bob","hit"};
        assertEquals("ball", instance.mostCommonWord("Bob. hIt, baLl", banned3));
    }
}
