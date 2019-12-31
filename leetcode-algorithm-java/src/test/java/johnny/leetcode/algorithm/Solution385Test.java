package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution385;
import johnny.leetcode.algorithm.common.NestedInteger;

public class Solution385Test extends JunitBase {

    @Test
    public void testDeserialize() {
        System.out.println("deserialize");
        Solution385 instance = new Solution385();

        assertEquals(null, instance.deserialize(""));

        NestedInteger expect2 = new NestedInteger(234);
        NestedInteger result2 = instance.deserialize("234");
        assertTrue(NestedInteger.isSame(expect2, result2));

        NestedInteger expect3 = new NestedInteger();
        expect3.list.add(new NestedInteger(123));
        expect3.list.add(new NestedInteger());
        expect3.list.get(1).list.add(new NestedInteger(456));
        expect3.list.get(1).list.add(new NestedInteger());
        expect3.list.get(1).list.get(1).list.add(new NestedInteger(789));
        NestedInteger result3 = instance.deserialize("[123,[456,[789]]]");
        assertTrue(NestedInteger.isSame(expect3, result3));

        NestedInteger expect4 = new NestedInteger();
        expect4.list.add(new NestedInteger());
        NestedInteger result4 = instance.deserialize("[[]]");
        assertTrue(NestedInteger.isSame(expect4, result4));

        NestedInteger expect5 = new NestedInteger();
        expect5.list.add(new NestedInteger());
        expect5.list.get(0).add(new NestedInteger(0));
        NestedInteger result5 = instance.deserialize("[[0]]");
        assertTrue(NestedInteger.isSame(expect5, result5));
    }
}
