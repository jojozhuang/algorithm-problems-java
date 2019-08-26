package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution966;

public class Solution966Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numsSameConsecDiff");
        Solution966 instance = new Solution966();

        assertArrayEquals(new String[] {"kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"}, instance.spellchecker(new String[] {"KiTe","kite","hare","Hare"},new String[] {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"}));
    }
}
