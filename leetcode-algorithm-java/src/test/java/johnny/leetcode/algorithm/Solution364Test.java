package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution364;
import johnny.algorithm.common.NestedInteger;

public class Solution364Test extends JunitBase {

    @Test
    public void testDepthSumInverse() {
        System.out.println("depthSumInverse");
        Solution364 instance = new Solution364();

        assertEquals(0, instance.depthSumInverse(null));
        assertEquals(6, instance.depthSumInverse(getExample1()));
        assertEquals(15, instance.depthSumInverse(getExample2()));
        assertEquals(8, instance.depthSumInverse(getExample3()));
    }

    public static List<NestedInteger> getExample1() {
        NestedInteger one = new NestedInteger();
        one.i = 1;
        NestedInteger two = new NestedInteger();
        two.i = 2;
        NestedInteger three = new NestedInteger();
        three.i = 3;

        List<NestedInteger> input = new ArrayList<NestedInteger>();
        input.add(one);
        input.add(two);
        input.add(three);

        return input;
    }
    public static List<NestedInteger> getExample2() {
        NestedInteger four = new NestedInteger();
        four.i = 4;
        List<NestedInteger> fourList = new ArrayList<NestedInteger>();
        fourList.add(four);
        NestedInteger fourElement = new NestedInteger();
        fourElement.list = fourList;

        NestedInteger five = new NestedInteger();
        five.i = 5;
        List<NestedInteger> fiveList = new ArrayList<NestedInteger>();
        fiveList.add(five);
        NestedInteger fiveElement = new NestedInteger();
        fiveElement.list = fiveList;

        NestedInteger six = new NestedInteger();
        six.i = 6;
        List<NestedInteger> sixList = new ArrayList<NestedInteger>();
        sixList.add(six);
        NestedInteger sixElement = new NestedInteger();
        sixElement.list = sixList;

        List<NestedInteger> input = new ArrayList<NestedInteger>();
        input.add(fourElement);
        input.add(fiveElement);
        input.add(sixElement);

        return input;
    }
    public static List<NestedInteger> getExample3() {
        NestedInteger one_1 = new NestedInteger();
        one_1.i = 1;

        NestedInteger one_2 = new NestedInteger();
        one_2.i = 1;

        List<NestedInteger> firstElement = new ArrayList<NestedInteger>();
        firstElement.add(one_1);
        firstElement.add(one_2);

        NestedInteger two = new NestedInteger();
        two.i = 2;

        NestedInteger one_3 = new NestedInteger();
        one_3.i = 1;

        NestedInteger one_4 = new NestedInteger();
        one_4.i = 1;

        List<NestedInteger> thirdElement = new ArrayList<NestedInteger>();
        thirdElement.add(one_3);
        thirdElement.add(one_4);

        NestedInteger firstElementObject = new NestedInteger();
        firstElementObject.list = firstElement;

        NestedInteger thirdElementObject = new NestedInteger();
        thirdElementObject.list = thirdElement;

        List<NestedInteger> input = new ArrayList<NestedInteger>();
        input.add(firstElementObject);
        input.add(two);
        input.add(thirdElementObject);

        return input;
    }
}
