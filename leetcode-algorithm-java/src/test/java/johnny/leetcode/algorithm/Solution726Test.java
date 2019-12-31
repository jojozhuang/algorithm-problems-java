package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution726;

public class Solution726Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countOfAtoms");
        Solution726 instance = new Solution726();

        assertEquals("H2O", instance.countOfAtoms("H2O"));
        assertEquals("H2MgO2", instance.countOfAtoms("Mg(OH)2"));
        assertEquals("K4N2O14S4", instance.countOfAtoms("K4(ON(SO3)2)2"));
    }
}
