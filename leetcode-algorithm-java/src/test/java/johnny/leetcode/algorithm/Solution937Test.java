package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution937Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reorderLogFiles");
        Solution937 instance = new Solution937();

        String[] logs1 = new String[] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] expect1 = new String[] {"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};
        assertArrayEquals(expect1, instance.reorderLogFiles(logs1));

        String[] logs2 = new String[] {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String[] expect2 = new String[] {"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"};
        assertArrayEquals(expect2, instance.reorderLogFiles(logs2));

        String[] logs3 = new String[] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};
        String[] expect3 = new String[] {"a2 act car","g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};
        assertArrayEquals(expect3, instance.reorderLogFiles(logs3));
    }
}
