package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1169;
import johnny.algorithm.leetcode.common.ListUtil;

public class SolutionA1169Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("invalidTransactions");
        SolutionA1169 instance = new SolutionA1169();

        List<String> result1 = instance.invalidTransactions(new String[] {"alice,20,800,mtv","alice,50,100,beijing"});
        List<String> expect1 = ListUtil.buildList(new String[] {"alice,20,800,mtv","alice,50,100,beijing"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));

        List<String> result2 = instance.invalidTransactions(new String[] {"alice,20,800,mtv","alice,50,1200,mtv"});
        List<String> expect2 = ListUtil.buildList(new String[] {"alice,50,1200,mtv"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        List<String> result3 = instance.invalidTransactions(new String[] {"alice,20,800,mtv","bob,50,1200,mtv"});
        List<String> expect3 = ListUtil.buildList(new String[] {"bob,50,1200,mtv"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));
        
        List<String> result4 = instance.invalidTransactions(new String[] {"alex,676,260,bangkok","bob,656,1366,bangkok","alex,393,616,bangkok","bob,820,990,amsterdam","alex,596,1390,amsterdam"});
        List<String> expect4 = ListUtil.buildList(new String[] {"bob,656,1366,bangkok","alex,596,1390,amsterdam"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect4, result4));
}
}
