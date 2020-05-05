package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3001 {
    public int minNumberOfFrogs(String croakOfFrogs) {
        if (croakOfFrogs == null || croakOfFrogs.isEmpty() || croakOfFrogs.length() % 5 != 0) {
            return -1;
        }

        int qc = 0;
        int qr = 0;
        int qo = 0;
        int qa = 0;

        int count = 1;
        int min = 1;
        for (char c : croakOfFrogs.toCharArray()) {
            if (c == 'c') {
                qc++;
                count++;
            } else if (c == 'r') {
                if (qc ==0 ) {
                    return -1;
                } else {
                    qr++;
                    qc--;
                }
            } else if (c == 'o') {
                if (qr == 0) {
                    return -1;
                } else {
                    qo++;
                    qr--;
                }
            } else if (c == 'a') {
                if (qo == 0) {
                    return -1;
                } else {
                    qa++;
                    qo--;
                }
            } else if (c == 'k') {
                if (qa == 0) {
                    return -1;
                } else {
                    qa--;
                    count--;
                    min = Math.max(min, count);
                }
            }
        }

        return min;
    }
}
