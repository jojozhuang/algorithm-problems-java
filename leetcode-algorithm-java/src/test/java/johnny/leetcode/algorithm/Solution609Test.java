package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution609;
import johnny.algorithm.common.ListUtil;

public class Solution609Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findDuplicate");
        Solution609 instance = new Solution609();

        String[] path1 = new String[] {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        List<List<String>> result1 = ListUtil.buildList2(new String[][] {{"root/a/2.txt","root/c/d/4.txt","root/4.txt"},{"root/a/1.txt","root/c/3.txt"}});
        assertEquals(result1, instance.findDuplicate(path1));
    }
}
