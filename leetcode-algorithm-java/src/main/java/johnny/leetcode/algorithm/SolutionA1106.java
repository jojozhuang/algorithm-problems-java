package johnny.leetcode.algorithm;

/**
 * 1106. Parsing A Boolean Expression
 * Return the result of evaluating a given boolean expression, represented as a string.
 * <p>
 * An expression can either be:
 * <p>
 * "t", evaluating to True;
 * "f", evaluating to False;
 * "!(expr)", evaluating to the logical NOT of the inner expression expr;
 * "&(expr1,expr2,...)", evaluating to the logical AND of 2 or more inner expressions expr1, expr2, ...;
 * "|(expr1,expr2,...)", evaluating to the logical OR of 2 or more inner expressions expr1, expr2, ...
 * <p>
 * Example 1:
 * Input: expression = "!(f)"
 * Output: true
 * <p>
 * Example 2:
 * Input: expression = "|(f,t)"
 * Output: true
 * <p>
 * Example 3:
 * Input: expression = "&(t,f)"
 * Output: false
 * <p>
 * Example 4:
 * Input: expression = "|(&(t,f,t),!(t))"
 * Output: false
 * <p>
 * Constraints:
 * <pre>{@code
 * 1 <= expression.length <= 20000
 * expression[i] consists of characters in {'(', ')', '&', '|', '!', 't', 'f', ','}.
 * expression is a valid expression representing a boolean, as given in the description.
 * }</pre>
 *
 * @author Johnny
 */
public class SolutionA1106 {
    public boolean parseBoolExpr(String expression) {
        return false;
    }
}
