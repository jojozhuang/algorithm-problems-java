package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1366Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("rankTeams");
        SolutionA1366 instance = new SolutionA1366();

        assertEquals("ACB", instance.rankTeams(new String[]{"ABC","ACB","ABC","ACB","ACB"}));
        assertEquals("XWYZ", instance.rankTeams(new String[]{"WXYZ","XYZW"}));
        assertEquals("ZMNAGUEDSJYLBOPHRQICWFXTVK", instance.rankTeams(new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"}));
    }
}
