package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SubstringAnagramsTest extends JunitBase  {

    /**
     * Test of findAnagrams method, of class SubstringAnagrams.
     */
    @Test
    public void testFindAnagrams() {
        System.out.println("findAnagrams");
        SubstringAnagrams instance = new SubstringAnagrams();
        List<Integer> expResult = new ArrayList<>();
        assertEquals(expResult, instance.findAnagrams("ab", ""));
        
        assertEquals(ListUtil.buildList(new Integer[]{0}), instance.findAnagrams("ab", "ab"));
        assertEquals(ListUtil.buildList(new Integer[]{2}), instance.findAnagrams("acba", "ab"));
        assertEquals(ListUtil.buildList(new Integer[]{2,3,4,5}), instance.findAnagrams("abdededf", "de"));
        assertEquals(ListUtil.buildList(new Integer[]{0,6}), instance.findAnagrams("cbaebabacd", "abc"));
    }
}
