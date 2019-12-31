package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution271;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution271Test extends JunitBase {

    @Test
    public void testEncode() {
        System.out.println("encode");
        Solution271 instance = new Solution271();

        assertEquals("", instance.encode(null));

        List<String> strs2 = ListUtil.buildList(new String[] {"hello","world","!"});
        assertEquals("5#hello5#world1#!", instance.encode(strs2));
    }

    @Test
    public void testDecode() {
        System.out.println("decode");
        Solution271 instance = new Solution271();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.decode(""));

        List<String> expect2 = ListUtil.buildList(new String[] {"hello","world","!"});
        assertEquals(expect2, instance.decode("5#hello5#world1#!"));
    }
}
