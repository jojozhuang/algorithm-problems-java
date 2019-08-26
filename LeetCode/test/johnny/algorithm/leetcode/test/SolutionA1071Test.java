package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1071;

public class SolutionA1071Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("heightChecker");
        SolutionA1071 instance = new SolutionA1071();

        assertEquals("ABC",instance.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB",instance.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("",instance.gcdOfStrings("LEET", "CODE"));
        assertEquals("TAUXX",instance.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        
        
       
    }
}
