package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution489;
import johnny.algorithm.leetcode.common.RobotImp;

public class Solution489Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("cleanRoom");
        Solution489 instance = new Solution489();

        RobotImp ri = new RobotImp();
        instance.cleanRoom(ri);
    }
}
