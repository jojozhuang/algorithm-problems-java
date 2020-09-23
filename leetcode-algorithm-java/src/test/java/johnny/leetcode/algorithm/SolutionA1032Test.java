package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1032Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("testStreamChecker");
/*
        SolutionA1032 instance1 = new SolutionA1032(new String[]{"cd","f","kl"});
        assertEquals(false, instance1.query('a'));
        assertEquals(false, instance1.query('b'));
        assertEquals(false, instance1.query('c'));
        assertEquals(true, instance1.query('d'));
        assertEquals(false, instance1.query('e'));
        assertEquals(true, instance1.query('f'));
        assertEquals(false, instance1.query('g'));
        assertEquals(false, instance1.query('h'));
        assertEquals(false, instance1.query('i'));
        assertEquals(false, instance1.query('j'));
        assertEquals(false, instance1.query('k'));
        assertEquals(true, instance1.query('l'));*/

        SolutionA1032 instance2 = new SolutionA1032(new String[]{"ab","ba","aaab","abab","baa"});
        assertEquals(false, instance2.query('a'));
        assertEquals(false, instance2.query('a'));
        assertEquals(false, instance2.query('a'));
        assertEquals(false, instance2.query('a'));
        assertEquals(false, instance2.query('a'));
        assertEquals(true, instance2.query('b'));
        assertEquals(true, instance2.query('a'));
        assertEquals(true, instance2.query('b'));
        assertEquals(true, instance2.query('a'));
        assertEquals(true, instance2.query('b'));
        assertEquals(false, instance2.query('b'));
        assertEquals(false, instance2.query('b'));

        //["StreamChecker","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query"]
//[[["ab","ba","aaab","abab","baa"]],["a"],["a"],["a"],["a"],["a"],["b"],["a"],["b"],["a"],["b"],["b"],["b"],["a"],["b"],["a"],["b"],["b"],["b"],["b"],["a"],["b"],["a"],["b"],["a"],["a"],["a"],["b"],["a"],["a"],["a"]]
    }
}
