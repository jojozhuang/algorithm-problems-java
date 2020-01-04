package johnny.lintcode.algorithm;

/**
 * Binary Representation.
 *
 * @author Johnny
 */
public class BinaryRepresentation {
    public String binaryRepresentation(String n) {
        // write your code here
        if (n == null || n.isEmpty()) {
            return "";
        }

        String[] strs = n.split("\\.");
        if (strs.length == 1) {
            return getInteger(strs[0]);
        }

        String fraction = getFraction(strs[1]);
        if (fraction.equals("ERROR")) {
            return "ERROR";
        } else if (fraction.equals("0") || fraction.isEmpty()) {
            return getInteger(strs[0]);
        }
        String integer = getInteger(strs[0]);

        return integer + "." + fraction;
    }

    private String getInteger(String str) {
        if (str.isEmpty()) {
            return "";
        }

        int num = Integer.parseInt(str);
        if (num == 0) {
            return "0";
        }
        String res = "";
        while (num > 0) {
            int lastbit = num & 1;
            res = String.valueOf(lastbit) + res;
            num = num >> 1;
        }
        return res;
    }

    private String getFraction(String str) {
        if (str.isEmpty()) {
            return "";
        }

        double num = Double.parseDouble("0." + str);
        String res = "";
        while (num != 0.0) {
            if (res.length() > 32) {
                return "ERROR";
            }
            num = num * 2;
            if (num >= 1) {
                res += "1";
                num -= 1;
            } else {
                res += "0";
            }
        }
        return res;
    }
}
