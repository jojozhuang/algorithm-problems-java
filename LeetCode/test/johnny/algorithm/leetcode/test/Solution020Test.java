package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution020;

public class Solution020Test extends JunitBase {

    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Solution020 instance = new Solution020();

        assertEquals(true, instance.isValid(""));
        assertEquals(true, instance.isValid("()"));
        assertEquals(false, instance.isValid("("));
        assertEquals(true, instance.isValid("()[]{}"));
        assertEquals(false, instance.isValid("(]"));
        assertEquals(false, instance.isValid("([)]"));
        assertEquals(false, instance.isValid(")}{({))[{{[}"));
        assertEquals(false, instance.isValid("(("));
    }
    
    @Test
    public void testIsValid2() {
        System.out.println("isValid2");
        Solution020 instance = new Solution020();

        HashMap<Character, Character> map = new HashMap();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('$', '^');
        assertEquals(true, instance.isValid2("", map));
        assertEquals(true, instance.isValid2("()", map));
        assertEquals(false, instance.isValid2("(", map));
        assertEquals(true, instance.isValid2("()[]{}", map));
        assertEquals(false, instance.isValid2("(]", map));
        assertEquals(false, instance.isValid2("([)]", map));
        assertEquals(false, instance.isValid2(")}{({))[{{[}", map));
        assertEquals(false, instance.isValid2("((", map));
        assertEquals(true, instance.isValid2("$^", map));
        assertEquals(false, instance.isValid2("$)", map));
        assertEquals(true, instance.isValid2("$$^^", map));
    }
}
