package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 *
 * @author Johnny
 */
public class SubdomainVisitCountTest extends JunitBase {

    /**
     * Test of subdomainVisits method, of class SubdomainVisitCount.
     */
    @Test
    public void testSubdomainVisitCount() {
        System.out.println("testSubdomainVisitCount");
        SubdomainVisitCount instance = new SubdomainVisitCount();

        List<String> domains1 = ListUtil.buildList(new String[]{"9001 discuss.lintcode.com"});
        List<String> expect1 = ListUtil.buildList(new String[]{"9001 discuss.lintcode.com", "9001 lintcode.com", "9001 com"});
        List<String> result1 = instance.subdomainVisits(domains1.toArray(new String[0]));
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));

        List<String> domains2 = ListUtil.buildList(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        List<String> expect2 = ListUtil.buildList(new String[]{"901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"});
        List<String> result2 = instance.subdomainVisits(domains2.toArray(new String[0]));
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));
    }
}
