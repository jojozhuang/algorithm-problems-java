package johnny.leetcode.algorithm;

/**
 * Validate IP Address
 * <p>
 * Write a function to check whether an input string is a valid IPv4 address or
 * IPv6 address or neither.
 * <p>
 * IPv4 addresses are canonically represented in dot-decimal notation, which
 * consists of four decimal numbers, each ranging from 0 to 255, separated by
 * dots ("."), e.g.,172.16.254.1;
 * <p>
 * Besides, leading zeros in the IPv4 is invalid. For example, the address
 * 172.16.254.01 is invalid.
 * <p>
 * IPv6 addresses are represented as eight groups of four hexadecimal digits,
 * each group representing 16 bits. The groups are separated by colons (":").
 * For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334 is a valid
 * one. Also, we could omit some leading zeros among four hexadecimal digits
 * and some low-case characters in the address to upper-case ones, so
 * 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address(Omit leading
 * zeros and using upper cases).
 * <p>
 * However, we don't replace a consecutive group of zero value with a single
 * empty group using two consecutive colons (::) to pursue simplicity. For
 * example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.
 * <p>
 * Besides, extra leading zeros in the IPv6 is also invalid. For example, the
 * address 02001:0db8:85a3:0000:0000:8a2e:0370:7334 is invalid.
 * <p>
 * Note: You may assume there is no extra space or special characters in the
 * input string.
 * <p>
 * Example 1:
 * Input: "172.16.254.1"
 * <p>
 * Output: "IPv4"
 * <p>
 * Explanation: This is a valid IPv4 address, return "IPv4".
 * <p>
 * Example 2:
 * Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"
 * <p>
 * Output: "IPv6"
 * Explanation: This is a valid IPv6 address, return "IPv6".
 * <p>
 * Example 3:
 * Input: "256.256.256.256"
 * <p>
 * Output: "Neither"
 * <p>
 * Explanation: This is neither a IPv4 address nor a IPv6 address.
 *
 * @author Johnny
 */
public class Solution468 {
    public String validIPAddress(String IP) {
        if (IP == null || IP.isEmpty()) {
            return "Neither";
        }

        if (isIPv4(IP)) {
            return "IPv4";
        }

        if (isIPv6(IP)) {
            return "IPv6";
        }

        return "Neither";
    }

    private boolean isIPv4(String IP) {
        if (IP.charAt(0) == '.') return false;
        if (IP.charAt(IP.length() - 1) == '.') return false;
        String[] arr = IP.split("\\.");
        if (arr.length != 4) {
            return false;
        }
        for (String section : arr) {
            if (section.isEmpty()) {
                return false;
            }
            if (section.charAt(0) == '0' && section.length() > 1) {
                return false;
            }
            if (section.length() > 3) {
                return false;
            }
            for (int i = 0; i < section.length(); i++) {
                char c = section.charAt(i);
                if (c < '0' || c > '9') {
                    return false;
                }
            }

            Integer address = Integer.parseInt(section);
            if (address < 0 || address > 255) {
                return false;
            }
            if (address != 0 && section.charAt(0) == '0') {
                return false;
            }
        }
        return true;
    }

    private boolean isIPv6(String IP) {
        if (IP.charAt(0) == ':') return false;
        if (IP.charAt(IP.length() - 1) == ':') return false;
        String[] arr = IP.split("\\:");
        if (arr.length != 8) {
            return false;
        }
        for (String section : arr) {
            if (section.isEmpty()) {
                return false;
            }
            if (section.length() > 4) {
                return false;
            }
            for (int i = 0; i < section.length(); i++) {
                char c = section.charAt(i);
                if (c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F') {

                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public String validIPAddress2(String IP) {
        if (isValidIPv4(IP)) return "IPv4";
        else if (isValidIPv6(IP)) return "IPv6";
        else return "Neither";
    }

    public boolean isValidIPv4(String ip) {
        if (ip.length() < 7) return false;
        if (ip.charAt(0) == '.') return false;
        if (ip.charAt(ip.length() - 1) == '.') return false;
        String[] tokens = ip.split("\\.");
        if (tokens.length != 4) return false;
        for (String token : tokens) {
            if (!isValidIPv4Token(token)) return false;
        }
        return true;
    }

    public boolean isValidIPv4Token(String token) {
        if (token.startsWith("0") && token.length() > 1) return false;
        try {
            int parsedInt = Integer.parseInt(token);
            if (parsedInt < 0 || parsedInt > 255) return false;
            if (parsedInt == 0 && token.charAt(0) != '0') return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean isValidIPv6(String ip) {
        if (ip.length() < 15) return false;
        if (ip.charAt(0) == ':') return false;
        if (ip.charAt(ip.length() - 1) == ':') return false;
        String[] tokens = ip.split(":");
        if (tokens.length != 8) return false;
        for (String token : tokens) {
            if (!isValidIPv6Token(token)) return false;
        }
        return true;
    }

    public boolean isValidIPv6Token(String token) {
        if (token.length() > 4 || token.length() == 0) return false;
        char[] chars = token.toCharArray();
        for (char c : chars) {
            boolean isDigit = c >= 48 && c <= 57;
            boolean isUppercaseAF = c >= 65 && c <= 70;
            boolean isLowerCaseAF = c >= 97 && c <= 102;
            if (!(isDigit || isUppercaseAF || isLowerCaseAF))
                return false;
        }
        return true;
    }
}
