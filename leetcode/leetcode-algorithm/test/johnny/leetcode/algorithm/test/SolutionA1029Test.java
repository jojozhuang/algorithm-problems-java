package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1029;

public class SolutionA1029Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("twoCitySchedCost");
        SolutionA1029 instance = new SolutionA1029();

        assertEquals(110, instance.twoCitySchedCost(new int[][] {{10,20},{30,200},{400,50},{30,20}}));
        assertEquals(1859, instance.twoCitySchedCost(new int[][] {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}}));
        assertEquals(1859, instance.twoCitySchedCost(new int[][] {{770,259},{54,448},{667,926},{139,184},{118,840},{469,577}}));
    }
}
