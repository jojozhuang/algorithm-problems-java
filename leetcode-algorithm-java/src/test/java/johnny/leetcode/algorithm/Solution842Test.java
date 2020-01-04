package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution842Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("splitIntoFibonacci");
        Solution842 instance = new Solution842();

        List<Integer> result1 = instance.splitIntoFibonacci("123456579");
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {123,456,579});
        assertEquals(expect1, result1);
        
        List<Integer> result2 = instance.splitIntoFibonacci("11235813");
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1,1,2,3,5,8,13});
        assertEquals(expect2, result2);
        
        List<Integer> result3 = instance.splitIntoFibonacci("112358130");
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect3, result3);
        
        List<Integer> result4 = instance.splitIntoFibonacci("0123");
        List<Integer> expect4 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect4, result4);
        
        List<Integer> result5 = instance.splitIntoFibonacci("1101111");
        List<Integer> expect5 = ListUtil.buildList(new Integer[] {11, 0, 11, 11});
        assertEquals(expect5, result5);
        
        List<Integer> result6 = instance.splitIntoFibonacci("214748364721474836422147483641");
        List<Integer> expect6 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect6, result6);

        List<Integer> result7 = instance.splitIntoFibonacci("417420815174208193484163452262453871040871393665402264706273658371675923077949581449611550452755");
        List<Integer> expect7 = ListUtil.buildList(new Integer[] {4,17420815,17420819,34841634,52262453,87104087,139366540,226470627,365837167,592307794,958144961,1550452755});
        assertEquals(expect7, result7);
        
        List<Integer> result8 = instance.splitIntoFibonacci("28607648200206406684");
        List<Integer> expect8 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect8, result8);
    }
}
