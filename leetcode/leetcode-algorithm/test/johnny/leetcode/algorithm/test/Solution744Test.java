package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution744;

public class Solution744Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("nextGreatestLetter");
        Solution744 instance = new Solution744();

        assertEquals('a', instance.nextGreatestLetter(new char[] {}, 'a'));
        assertEquals('j', instance.nextGreatestLetter(new char[] {'j'}, 'a'));
        assertEquals('c', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'a'));
        assertEquals('f', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c'));
        assertEquals('f', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'd'));
        assertEquals('j', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'g'));
        assertEquals('c', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'j'));
        assertEquals('c', instance.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'k'));
    }
}
