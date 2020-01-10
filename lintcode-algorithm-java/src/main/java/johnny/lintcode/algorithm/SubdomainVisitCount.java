package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Subdomain Visit Count
 * <p>
 * A website domain like "discuss.lintcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "lintcode.com", and at the lowest level, "discuss.lintcode.com". When we visit a domain like "discuss.lintcode.com", we will also visit the parent domains "lintcode.com" and "com" implicitly.
 *
 * Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.lintcode.com".
 *
 * We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
 *
 * Example
 * Example 1:
 *
 * Input:
 * ["9001 discuss.lintcode.com"]
 * Output:
 * ["9001 discuss.lintcode.com", "9001 lintcode.com", "9001 com"]
 * Explanation:
 * We only have one website domain: "discuss.lintcode.com". As discussed above, the subdomain "lintcode.com" and "com" will also be visited. So they will all be visited 9001 times.
 * Example 2:
 *
 * Input:
 * ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
 * Output:
 * ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
 * Explanation:
 * We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.
 * @author Johnny
 */
public class SubdomainVisitCount {
    /**
     * @param cpdomains: a list cpdomains of count-paired domains
     * @return: a list of count-paired domains
     */
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new ArrayList<>();
        if (cpdomains == null || cpdomains.length == 0) {
            return ans;
        }

        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            int index = domain.indexOf(" ");
            int count = Integer.parseInt(domain.substring(0, index));
            String subdomain = domain.substring(index + 1);
            if (!map.containsKey(subdomain)) {
                map.put(subdomain, 0);
            }
            map.put(subdomain, map.get(subdomain) + count);
            while (domain.indexOf(".", index) > 0) {
                index = domain.indexOf(".", index);
                subdomain = domain.substring(++index);
                if (!map.containsKey(subdomain)) {
                    map.put(subdomain, 0);
                }
                map.put(subdomain, map.get(subdomain) + count);
            }
        }

        ans = map.entrySet().stream()
                .map(x -> (x.getValue() + " " + x.getKey()))
                .collect(Collectors.toList());
        return ans;
    }
}
