package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1172;

public class SolutionA1172Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("heightChecker");
        SolutionA1172 instance = new SolutionA1172(2);

        instance.push(1);
        instance.push(2);
        instance.push(3);
        instance.push(4);
        instance.push(5);         // The stacks are now:  2  4
        instance.popAtStack(0);   // Returns 2.  The stacks are now:     4
        instance.push(20);        // The stacks are now: 20  4
        instance.push(21);        // The stacks are now: 20  4 21
        instance.popAtStack(0);   // Returns 20.  The stacks are now:     4 21
        instance.popAtStack(2);   // Returns 21.  The stacks are now:     4
        instance.pop();            // Returns 5.  The stacks are now:      4
        instance.pop();            // Returns 4.  The stacks are now:   1  3 
        instance.pop();            // Returns 3.  The stacks are now:   1 
        instance.pop();            // Returns 1.  There are no stacks.
        instance.pop();            // Returns -1.  There are still no stacks.
        
        SolutionA1172 instance2 = new SolutionA1172(2);

        instance2.push(472);
        instance2.push(106);
        instance2.push(497);
        instance2.push(498);
        instance2.push(73);         // The stacks are now:  2  4
        instance2.push(115);         // The stacks are now:  2  4
        instance2.push(437);         // The stacks are now:  2  4
        instance2.push(461);         // The stacks are now:  2  4
        instance2.popAtStack(3);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(3);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(1);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(3);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(0);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(2);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(2);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(1);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(1);   // Returns 2.  The stacks are now:     4
        instance2.popAtStack(3);   // Returns 2.  The stacks are now:     4

        instance2.push(197);
        instance2.push(239);
        instance2.push(129);
        instance2.push(449);
        instance2.push(460);         // The stacks are now:  2  4
        instance2.push(240);         // The stacks are now:  2  4
        instance2.push(386);         // The stacks are now:  2  4
        instance2.push(343);         // The stacks are now:  2  4

        instance2.pop();            // Returns 5.  The stacks are now:      4
        instance2.pop();            // Returns 4.  The stacks are now:   1  3 
        instance2.pop();            // Returns 3.  The stacks are now:   1 
        instance2.pop();            // Returns 1.  There are no stacks.
        instance2.pop();            // Returns -1.  There are still no stacks.
        instance2.pop();            // Returns 5.  The stacks are now:      4
        instance2.pop();            // Returns 4.  The stacks are now:   1  3 
        instance2.pop();            // Returns 3.  The stacks are now:   1 
        instance2.pop();            // Returns 1.  There are no stacks.
        instance2.pop();            // Returns -1.  There are still no stacks.
    }
}
