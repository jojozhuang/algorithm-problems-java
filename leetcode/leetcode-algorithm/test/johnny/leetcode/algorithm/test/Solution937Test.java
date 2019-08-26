package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution937;

public class Solution937Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validMountainArray");
        Solution937 instance = new Solution937();

        String[] logs1 = new String[] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        String[] expect1 = new String[] {"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};
        assertArrayEquals(expect1, instance.reorderLogFiles(logs1));
    }
}
