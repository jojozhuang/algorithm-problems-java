package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution929;

public class Solution929Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numUniqueEmails");
        Solution929 instance = new Solution929();

        String[] emails1 = new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertEquals(2, instance.numUniqueEmails(emails1));
    }
}
