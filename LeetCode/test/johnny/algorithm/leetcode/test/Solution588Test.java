package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution588;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution588Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("FileSystem");
        Solution588 instance = new Solution588();

        List<String> result1 = ListUtil.buildList(new String[] {});
        assertEquals(result1, instance.ls("/"));
        instance.mkdir("/a/b/c");
        instance.addContentToFile("/a/b/c/d","hello");
        assertEquals("hello", instance.readContentFromFile("/a/b/c/d"));
    }
}
