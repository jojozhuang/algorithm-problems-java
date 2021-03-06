package johnny.hackerrank.algorithm;

/**
 *
 * @author Johnny
 */
public class Encryption {
    public static String encrypt(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        int len = s.length();
        int row = (int)Math.floor(Math.sqrt(len));
        int col = (int)Math.ceil(Math.sqrt(len));
        if (len % col > 0) {
            row++;
        }
        
        String[] word = new String[col];
        for (int j = 0; j < col; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < row; i++) {
                if (i * col + j < len) {
                    sb.append(s.charAt(i * col + j));
                } else {
                    break;
                }
            }
            word[j] = sb.toString();
        }
        
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            ret.append(word[i]);
            ret.append(" ");
        }
        ret.deleteCharAt(ret.length() - 1);
        return ret.toString();
    }
}
