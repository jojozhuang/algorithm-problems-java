package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumDeletionTest extends JunitBase {

    @Test
    public void testMinimumDeletion() {
        System.out.println("minDeletionsToObtainStringInRightFormat");
        MinimumDeletion instance = new MinimumDeletion();

        assertEquals(2, instance.minDeletionsToObtainStringInRightFormat("BAAABAB"));
        assertEquals(3, instance.minDeletionsToObtainStringInRightFormat("BBABAA"));
        assertEquals(0, instance.minDeletionsToObtainStringInRightFormat("AABBBB"));
    }
    
}
