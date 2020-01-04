package johnny.lintcode.algorithm;

/**
 * @author Johnny
 */
public class ValidWordAbbreviation {
    /**
     * @param word: a non-empty string
     * @param abbr: an abbreviation
     * @return: true if string matches with the given abbr or false
     */
    public boolean validWordAbbreviation(String word, String abbr) {
        if (abbr == null) {
            return false;
        }

        if (abbr.length() > word.length()) {
            return false;
        }

        int i = 0;
        int j = 0;
        while (i < word.length() && j < abbr.length()) {
            char c1 = word.charAt(i);
            char c2 = abbr.charAt(j);
            if (c1 == c2) {
                i++;
                j++;
            } else {
                if (c2 < '0' || c2 > '9') {
                    return false;
                }
                int num = 0;
                while (j < abbr.length()) {
                    c2 = abbr.charAt(j);
                    if (c2 < '0' || c2 > '9') {
                        break;
                    }
                    num = num * 10 + (c2 - '0');
                    j++;
                }
                i += num;
            }
        }

        return i == word.length() && j == abbr.length();
    }
}
