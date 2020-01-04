package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution293Test extends JunitBase {

    @Test
    public void testGeneratePossibleNextMoves() {
        System.out.println("generatePossibleNextMoves");
        Solution293 instance = new Solution293();

        List<String> expect1 = new ArrayList<String>();
        assertEquals(expect1, instance.generatePossibleNextMoves(""));

        List<String> expect2 = ListUtil.buildList(new String[] {"--++","+--+","++--"});
        assertEquals(expect2, instance.generatePossibleNextMoves("++++"));
    }
}
