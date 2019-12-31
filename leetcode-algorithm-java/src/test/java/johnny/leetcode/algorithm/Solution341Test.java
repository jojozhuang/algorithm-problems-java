package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.leetcode.algorithm.Solution341;
import johnny.leetcode.algorithm.common.NestedInteger;

public class Solution341Test extends JunitBase {

    @Test
    public void testNext() {
        System.out.println("next");

        Solution341 instance0 = new Solution341(getExampleEmpty());
        assertEquals(false, instance0.hasNext());
        assertEquals(null, instance0.next());

        //[1,2,3]
        Solution341 instance1 = new Solution341(getExample1());
        assertEquals(true, instance1.hasNext());
        assertEquals(Integer.valueOf(1), instance1.next());
        assertEquals(true, instance1.hasNext());
        assertEquals(Integer.valueOf(2), instance1.next());
        assertEquals(true, instance1.hasNext());
        assertEquals(Integer.valueOf(3), instance1.next());
        assertEquals(false, instance1.hasNext());
        assertEquals(null, instance1.next());

         //[[4],[5],[6]]
        Solution341 instance2 = new Solution341(getExample2());
        assertEquals(true, instance2.hasNext());
        assertEquals(Integer.valueOf(4), instance2.next());
        assertEquals(true, instance2.hasNext());
        assertEquals(Integer.valueOf(5), instance2.next());
        assertEquals(true, instance2.hasNext());
        assertEquals(Integer.valueOf(6), instance2.next());
        assertEquals(false, instance2.hasNext());
        assertEquals(null, instance2.next());

        //[[1,2],3,[4,5]]
        Solution341 instance3 = new Solution341(getExample3());
        assertEquals(true, instance3.hasNext());
        assertEquals(Integer.valueOf(1), instance3.next());
        assertEquals(true, instance3.hasNext());
        assertEquals(Integer.valueOf(2), instance3.next());
        assertEquals(true, instance3.hasNext());
        assertEquals(Integer.valueOf(3), instance3.next());
        assertEquals(true, instance3.hasNext());
        assertEquals(Integer.valueOf(4), instance3.next());
        assertEquals(true, instance3.hasNext());
        assertEquals(Integer.valueOf(5), instance3.next());
        assertEquals(false, instance3.hasNext());
        assertEquals(null, instance3.next());
    }

    //[[]]
    public static List<NestedInteger> getExampleEmpty() {
        NestedInteger empty = new NestedInteger();
        List<NestedInteger> input = new ArrayList<NestedInteger>();
        input.add(empty);
        return input;
    }

    //[1,2,3]
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
    //[[4],[5],[6]]
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
    //[[1,2],3,[4,5]]
    public static List<NestedInteger> getExample3() {
        NestedInteger one_1 = new NestedInteger();
        one_1.i = 1;

        NestedInteger one_2 = new NestedInteger();
        one_2.i = 2;

        List<NestedInteger> firstElement = new ArrayList<NestedInteger>();
        firstElement.add(one_1);
        firstElement.add(one_2);

        NestedInteger two = new NestedInteger();
        two.i = 3;

        NestedInteger one_3 = new NestedInteger();
        one_3.i = 4;

        NestedInteger one_4 = new NestedInteger();
        one_4.i = 5;

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
