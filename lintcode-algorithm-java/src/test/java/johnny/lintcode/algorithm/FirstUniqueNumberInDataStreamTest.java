package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueNumberInDataStreamTest extends JunitBase {

    @Test
    public void testFirstUniqueNumber() {
        System.out.println("firstUniqueNumber");
        FirstUniqueNumberInDataStream instance = new FirstUniqueNumberInDataStream();

        assertEquals(3, instance.firstUniqueNumber(new int[]{1, 2, 2, 1, 3, 4, 4, 5, 6}, 5));
        assertEquals(-1, instance.firstUniqueNumber(new int[]{1, 2, 2, 1, 3, 4, 4, 5, 6}, 7));
        assertEquals(3, instance.firstUniqueNumber(new int[]{1, 2, 2, 1, 3, 4}, 3));
    }
    
}
