package johnny.lintcode.algorithm;

/**
 * A + B Problem.
 * <p>
 * Write a function that add two numbers A and B. You should not use + or any arithmetic operators.
 * <p>
 * Example
 * Given a=1 and b=2 return 3
 * <p>
 * Note
 * There is no need to read data from standard input stream.
 * Both parameters are given in function aplusb, you job is to calculate the sum and return it.
 * <p>
 * Challenge
 * Of course you can just return a + b to get accepted. But Can you challenge not do it like that?
 * <p>
 * Clarification
 * Are a and b both 32-bit integers? Yes.
 * Can I use bit operation? Sure you can.
 *
 * @author Johnny
 */
public class AplusBProblem {
    public int aplusb(int a, int b) {
        int result = a ^ b;
        int carry = a & b;
        carry <<= 1;
        if (carry != 0) {
            result = aplusb(result, carry);
        }

        return result;
    }
}
