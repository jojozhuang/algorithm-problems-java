package johnny.lintcode.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class PalindromePartitioningTest extends JunitBase {

    /**
     * Test of partition method, of class PalindromePartitioning.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        String s = "";
        PalindromePartitioning instance = new PalindromePartitioning();
        List<List<String>> expResult = new ArrayList<List<String>>();
        List<List<String>> result = instance.partition(s);
        assertEquals(expResult, result);
        
        List<String> result21 = new ArrayList<>();
        result21.add("a");
        List<List<String>> expResult2 = new ArrayList<>();
        expResult2.add(result21);        
        assertEquals(expResult2, instance.partition("a"));
        
        List<String> result31 = new ArrayList<>();
        result31.add("a");
        result31.add("b");
        List<List<String>> expResult3 = new ArrayList<>();
        expResult3.add(result31);
        assertEquals(expResult3, instance.partition("ab"));

        List<String> result41 = new ArrayList<>();
        result41.add("aa");
        result41.add("b");
        List<String> result42 = new ArrayList<>();
        result42.add("a");
        result42.add("a");
        result42.add("b");
        List<List<String>> expResult4 = new ArrayList<>();
        expResult4.add(result42);  
        expResult4.add(result41);   
        assertEquals(expResult4, instance.partition("aab"));
    }
}
