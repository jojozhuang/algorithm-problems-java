package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution412Test extends JunitBase {

    @Test
    public void testFizzBuzz() {
        System.out.println("fizzBuzz");
        Solution412 instance = new Solution412();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.fizzBuzz(0));

        List<String> expect2 = ListUtil.buildList(new String[] {"1"});
        assertEquals(expect2, instance.fizzBuzz(1));

        List<String> expect3 = ListUtil.buildList(new String[] {"1","2","Fizz","4","Buzz"});
        assertEquals(expect3, instance.fizzBuzz(5));

        List<String> expect4 = ListUtil.buildList(new String[] {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"});
        assertEquals(expect4, instance.fizzBuzz(15));
    }
}
