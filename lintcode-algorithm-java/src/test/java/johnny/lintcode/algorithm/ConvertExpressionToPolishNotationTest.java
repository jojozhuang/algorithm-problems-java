package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertExpressionToPolishNotationTest extends JunitBase {

    @Test
    public void testConvertToPN() {
        System.out.println("convertToPN");
        ConvertExpressionToPolishNotation instance = new ConvertExpressionToPolishNotation();

        //assertEquals(ListUtil.buildList(new String[]{"*", "-", "5", "6", "7"}), instance.convertToPN(new String[]{"(", "5", "-", "6", ")", "*", "7"}));
        //assertEquals(ListUtil.buildList(new String[]{"+", "3", "-", "1", "2"}), instance.convertToPN(new String[]{"3", "+", "(", "1", "-", "2", ")"}));
        assertEquals(ListUtil.buildList(new String[]{}), instance.convertToPN(new String[]{"(","(","(","(","(",")",")",")",")",")"}));
    }
    
}
