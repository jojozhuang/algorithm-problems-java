package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution187Test extends JunitBase {

    @Test
    public void testFindRepeatedDnaSequences() {
        System.out.println("findRepeatedDnaSequences");
        Solution187 instance = new Solution187();

        List<String> expect1 = new ArrayList<>();
        assertEquals(expect1, instance.findRepeatedDnaSequences(""));

        List<String> expect2 = ListUtil.buildList(new String[] {"AAAAACCCCC","CCCCCAAAAA"});
        assertEquals(expect2,  instance.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));

        List<String> expect3 = ListUtil.buildList(new String[] {"AAAAACCCCC"});
        assertEquals(expect3,  instance.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCTTTTTGGGTTT"));
    }
}
