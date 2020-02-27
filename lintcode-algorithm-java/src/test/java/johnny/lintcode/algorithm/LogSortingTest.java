package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Johnny
 */
public class LogSortingTest extends JunitBase {

    /**
     * Test of logSort method, of class LogSorting.
     */
    @Test
    public void testLogSorting() {
        System.out.println("logSort");
        LogSorting instance = new LogSorting();
        assertArrayEquals(new String[]{"a100 Act zoo","g9 act car","zo4 4 7","a1 9 2 3 1"}, instance.logSort(new String[]{"zo4 4 7","a100 Act zoo","a1 9 2 3 1","g9 act car"}));

        String[] input2 = new String[] {
                "zo4 4 7",
                "a100 Actzoo",
                "a100 Act zoo",
                "Tac Bctzoo",
                "Tab Bctzoo",
                "g9 act car"
        };
        String[] expect2 = new String[] {
                "a100 Act zoo",
                "a100 Actzoo",
                "Tab Bctzoo",
                "Tac Bctzoo",
                "g9 act car",
                "zo4 4 7"
        };
        assertArrayEquals(expect2, instance.logSort(input2));
    }
}
