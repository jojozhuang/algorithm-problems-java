package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution635Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("LogSystem");
        Solution635 instance = new Solution635();

        instance.put(1, "2017:01:01:23:59:59");
        instance.put(2, "2017:01:01:22:59:59");
        instance.put(3, "2016:01:01:00:00:00");

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,2,3});
        assertEquals(expect1, instance.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Year"));

        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1,2});
        assertEquals(expect2, instance.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour"));
    }
}
