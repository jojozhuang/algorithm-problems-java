package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution422;
import johnny.algorithm.common.ListUtil;

public class Solution422Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validWordSquare");
        Solution422 instance = new Solution422();

        List<String> words1 = ListUtil.buildList(new String[] {"abcd","bnrt","crmy","dtye"});
        assertEquals(true, instance.validWordSquare(words1));

        List<String> words2 = ListUtil.buildList(new String[] {"abcd","bnrt","crm","dt"});
        assertEquals(true, instance.validWordSquare(words2));

        List<String> words3 = ListUtil.buildList(new String[] {"ball","area","read","lady"});
        assertEquals(false, instance.validWordSquare(words3));
    }
}
