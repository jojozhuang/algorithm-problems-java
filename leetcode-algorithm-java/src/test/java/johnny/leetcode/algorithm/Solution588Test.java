package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution588Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("FileSystem");
        Solution588 instance = new Solution588();

        List<String> result1 = ListUtil.buildList(new String[] {});
        assertEquals(result1, instance.ls("/"));
        instance.mkdir("/a/b/c");
        instance.addContentToFile("/a/b/c/d","hello");
        List<String> result2 = ListUtil.buildList(new String[] {"a"});
        assertEquals(result2, instance.ls("/"));
        assertEquals("hello", instance.readContentFromFile("/a/b/c/d"));
    }
}
