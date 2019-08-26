package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.leetcode.algorithm.Solution811;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution811Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("subdomainVisits");
        Solution811 instance = new Solution811();

        String[] domains1 = new String[] {"9001 discuss.leetcode.com"};
        List<String> expect1 = ListUtil.buildList(new String[] {"9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, instance.subdomainVisits(domains1)));

        String[] domains2 = new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> expect2 = ListUtil.buildList(new String[] {"901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"});
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, instance.subdomainVisits(domains2)));
    }
}
