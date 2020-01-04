package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution751Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("ipToCIDR");
        Solution751 instance = new Solution751();

        List<String> expect1 = ListUtil.buildList(new String[] {"255.0.0.7/32","255.0.0.8/29","255.0.0.16/32"});
        assertEquals(expect1, instance.ipToCIDR("255.0.0.7", 10));
    }
}
