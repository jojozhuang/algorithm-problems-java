package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Strings That Satisfies The Condition.
 * Given a string target and a string array s, output all strings containing target(ie target is a subsequence of s[i]) in their original order in the array s
 *
 * Example1
 * Input: target=”google”,s=[“goooogle”,”abc”,”google”,”higoogle”,”googlg”,”gowogwle”,”gogle”]
 * Output: [“goooogle”,”google”,”higoogle”,”gowogwle”]
 *
 * Explanation:
 * goooogle
 * google
 * higoogle
 * gowogwle
 *
 *
 * Example2
 * Input: target=”hello”,s=[“helolo”,”helo”,”heello”,”hhepllo”,”olleh”]
 * Output: [“helolo”,”heello”,”hhepllo”]
 * Explanation:
 *
 * helolo
 * heello
 * hhepllo
 *
 * @author Johnny
 */
public class StringsThatSatisfiesTheCondition {
    /**
     * @param target: the target string
     * @param s:
     * @return: output all strings containing target  in s
     */
    public String[] getAns(String target, String[] s) {
        List<String> list = new ArrayList<>();

        for (String word : s) {
            if (word.length() >= target.length()) {
                int i = 0;
                int j = 0;
                for (; i < target.length(); i++) {
                    while (j < word.length()) {
                        if (target.charAt(i) != word.charAt(j)) {
                            j++;
                        } else {
                            break;
                        }
                    }
                    if (j < word.length() - 1) {
                        j++;
                    }
                }
                if (i >= target.length() && j < word.length()) {
                    list.add(word);
                }
            }
        }

        return list.toArray(new String[0]);
    }
}
