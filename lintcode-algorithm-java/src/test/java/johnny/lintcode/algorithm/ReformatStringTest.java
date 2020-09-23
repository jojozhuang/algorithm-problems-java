package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReformatStringTest extends JunitBase {

    @Test
    public void testReformatString() {
        System.out.println("testReformatString");
        ReformatString instance = new ReformatString();

        assertEquals("deabchfgi", instance.reformatString("abcdefghi", new int[]{3, 2, 2, 1, 1}));
    }
}
