package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution811;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution811Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("subdomainVisits");
        Solution811 instance = new Solution811();
        
        String[] domains1 = new String[] {"9001 discuss.leetcode.com"};
        List<String> result1 = ListUtil.buildList(new String[] {"9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"});
        assertTrue(ListUtil.equalsIgnoreOrder(result1, instance.subdomainVisits(domains1)));

        String[] domains2 = new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> result2 = ListUtil.buildList(new String[] {"901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"});
        assertTrue(ListUtil.equalsIgnoreOrder(result2, instance.subdomainVisits(domains2)));
    }

}
