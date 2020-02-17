package johnny.company.algorithm;

import johnny.algorithm.common.NaryNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtreeMaximumAverageTest extends JunitBase {

    @Test
    public void testMaximumAverage() {
        System.out.println("maximumAverage");
        SubtreeMaximumAverage instance = new SubtreeMaximumAverage();

        NaryNode root1 = NaryNode.createInstance("20,2,12,3,11,0,2,0,3,0,18,2,15,0,8,0");
        NaryNode expect1 = root1.children.get(1); // node.val = 18
        assertEquals(expect1, instance.maximumAverage(root1));

        NaryNode root2 = NaryNode.createInstance("1,3,3,2,2,0,4,0,2,0,5,0");
        NaryNode expect2 = root2.children.get(0); // node.val = 3
        assertEquals(expect2, instance.maximumAverage(root2));
    }
}
