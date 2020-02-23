package johnny.leetcode.algorithm;

/**
 * @author Johnny
 */
public class SolutionA1214 {

    public String largestMultipleOfThree(int[] digits) {
        int sum = 0;
        int[] count = new int[10];
        boolean allzero = true;
        for (int i : digits) {
            count[i]++;
            sum += i;
            if (i != 0) {
                allzero = false;
            }
        }

        if (allzero) {
            return "0";
        }

        boolean found = false;
        while (sum > 0) {
            if (sum % 3 == 0) {
                found = true;
                break;
            } else {
                boolean next = false;
                for (int i = 1; i < 10; i++) {
                    if (count[i] > 0) {
                        count[i]--;
                        sum -= i;
                        next = true;
                        break;
                    }
                }

                if (!next) {
                    break;
                }
            }
        }

        if (!found) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (count[i] > 0) {
                sb.append(i);
                count[i]--;
            }
        }

        return sb.toString();
    }


    public String largestMultipleOfThree2(int[] digits) {
        int sum = 0;
        int[] count = new int[10];
        boolean allzero = true;
        for (int i : digits) {
            count[i]++;
            sum += i;
            if (i != 0) {
                allzero = false;
            }
        }

        if (allzero) {
            return "0";
        }

        int total = sum;
        boolean found = false;
        while (sum > 0) {
            if (sum % 3 == 0) {
                int diff = total - sum;
                for (int i = 1; i < 10; i++) {
                    int number = diff / i;
                    if (number == 0) {
                        break;
                    }
                    if (count[i] >= number) {
                        count[i] -= number;
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                } else {
                    sum--;
                }
            } else {
                sum--;
            }
        }

        if (!found) {
            return "";
        }



        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (count[i] > 0) {
                sb.append(i);
                count[i]--;
            }
        }

        return sb.toString();
    }
}
