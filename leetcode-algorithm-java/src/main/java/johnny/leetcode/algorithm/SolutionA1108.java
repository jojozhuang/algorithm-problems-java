package johnny.leetcode.algorithm;

/**
 * 1108. Defanging an IP Address
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * <p>
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The given address is a valid IPv4 address.
 *
 * @author Johnny
 */
public class SolutionA1108 {
    // StringBuilder
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // String.replace();
    public String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }
}
