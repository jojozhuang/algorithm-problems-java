package johnny.leetcode.algorithm;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;

public class SolutionA1374Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallerNumbersThanCurrent");
        SolutionA1374 instance = new SolutionA1374();

        String result1 = instance.generateTheString(4);
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : result1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            assertTrue(entry.getValue() % 2 == 1);
        }

        String result2 = instance.generateTheString(2);
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : result2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            assertTrue(entry.getValue() % 2 == 1);
        }

        String result3 = instance.generateTheString(7);
        Map<Character, Integer> map3 = new HashMap<>();
        for (char c : result3.toCharArray()) {
            map3.put(c, map3.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map3.entrySet()) {
            assertTrue(entry.getValue() % 2 == 1);
        }
    }
}
