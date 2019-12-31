package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1018;

public class SolutionA1018Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("prefixesDivBy5");
        SolutionA1018 instance = new SolutionA1018();

        List<Boolean> expect1 = Arrays.asList(true, false, false);
        assertEquals(expect1, instance.prefixesDivBy5(new int[] {0,1,1}));

        List<Boolean> expect2 = Arrays.asList(false, false, false);
        assertEquals(expect2, instance.prefixesDivBy5(new int[] {1,1,1}));
        
        List<Boolean> expect3 = Arrays.asList(true,false,false,false,true,false);
        assertEquals(expect3, instance.prefixesDivBy5(new int[] {0,1,1,1,1,1}));
    }
}
