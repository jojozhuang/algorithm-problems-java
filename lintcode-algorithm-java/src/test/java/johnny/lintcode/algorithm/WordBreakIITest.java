package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class WordBreakIITest extends JunitBase {

    /**
     * Test of climbStairs2 method, of class ClimbingStairsII.
     */
    @Test
    public void testClimbStairs2() {
        System.out.println("climbStairs2");
        WordBreakII instance = new WordBreakII();

        List<String> list1 = ListUtil.buildList(new String[]{"de","ding","co","code","lint"});
        Set<String> set1 = new HashSet<>(list1);
        List<String> result1 = instance.wordBreak("lintcode", set1);
        List<String> expect1 = ListUtil.buildList(new String[]{"lint code", "lint co de"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));

        List<String> list2 = ListUtil.buildList(new String[]{});
        Set<String> set2 = new HashSet<>(list2);
        List<String> expect2 = ListUtil.buildList(new String[]{});
        assertEquals(expect2, instance.wordBreak("a", set2));

        List<String> list3 = ListUtil.buildList(new String[]{"aaaa","aa","a"});
        Set<String> set3 = new HashSet<>(list3);
        List<String> result3 = instance.wordBreak("aaaaaaaa", set3);
        List<String> expect3 = ListUtil.buildList(new String[]{"a a a a a a a a","a a a a a a aa","a a a a a aa a","a a a a aa a a","a a a a aa aa","a a a a aaaa","a a a aa a a a","a a a aa a aa","a a a aa aa a","a a a aaaa a","a a aa a a a a","a a aa a a aa","a a aa a aa a","a a aa aa a a","a a aa aa aa","a a aa aaaa","a a aaaa a a","a a aaaa aa","a aa a a a a a","a aa a a a aa","a aa a a aa a","a aa a aa a a","a aa a aa aa","a aa a aaaa","a aa aa a a a","a aa aa a aa","a aa aa aa a","a aa aaaa a","a aaaa a a a","a aaaa a aa","a aaaa aa a","aa a a a a a a","aa a a a a aa","aa a a a aa a","aa a a aa a a","aa a a aa aa","aa a a aaaa","aa a aa a a a","aa a aa a aa","aa a aa aa a","aa a aaaa a","aa aa a a a a","aa aa a a aa","aa aa a aa a","aa aa aa a a","aa aa aa aa","aa aa aaaa","aa aaaa a a","aa aaaa aa","aaaa a a a a","aaaa a a aa","aaaa a aa a","aaaa aa a a","aaaa aa aa","aaaa aaaa"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));
    }
    
}
