package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.common.RobotImp;
import org.junit.Test;

public class Solution489Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("cleanRoom");
        Solution489 instance = new Solution489();

        RobotImp ri = new RobotImp();
        instance.cleanRoom(ri);
    }
}
