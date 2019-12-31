package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution187;
import johnny.leetcode.algorithm.common.ListUtil;

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
