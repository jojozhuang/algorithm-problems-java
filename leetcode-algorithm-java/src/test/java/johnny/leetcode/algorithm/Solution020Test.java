package johnny.leetcode.algorithm;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

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

        HashMap<Character, Character> map = new HashMap<Character, Character>();
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
