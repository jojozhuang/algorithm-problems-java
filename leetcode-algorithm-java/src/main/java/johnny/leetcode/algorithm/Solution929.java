package johnny.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 929. Unique Email Addresses
 * Every email consists of a local name and a domain name, separated by the @ sign.
 * <p>
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 * <p>
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 * <p>
 * If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
 * <p>
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
 * <p>
 * It is possible to use both of these rules at the same time.
 * <p>
 * Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
 * <p>
 * Example 1:
 * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * Output: 2
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 * <p>
 * Note:
 * <pre>{@code
 * 1 <= emails[i].length <= 100
 * 1 <= emails.length <= 100
 * Each emails[i] contains exactly one '@' character.
 * }</pre>
 *
 * @author Johnny
 */
public class Solution929 {
    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length == 0) {
            return 0;
        }

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String local = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"), email.length());
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }
            if (local.contains(".")) {
                local = local.replaceAll("\\.", "");
            }
            email = local + domain;
            set.add(email);
        }

        return set.size();
    }
}
