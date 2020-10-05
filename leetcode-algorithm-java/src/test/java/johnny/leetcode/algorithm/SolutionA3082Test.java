package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA3082Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containsPattern");
        SolutionA3082 instance = new SolutionA3082("king");
        instance.birth("king", "andy"); // order: king > andy
        instance.birth("king", "bob"); // order: king > andy > bob
        instance.birth("king", "catherine"); // order: king > andy > bob > catherine
        instance.birth("andy", "matthew"); // order: king > andy > matthew > bob > catherine
        instance.birth("bob", "alex"); // order: king > andy > matthew > bob > alex > catherine
        instance.birth("bob", "asha"); // order: king > andy > matthew > bob > alex > asha > catherine
        List<String> result1 = instance.getInheritanceOrder(); // return ["king", "andy", "matthew", "bob", "alex", "asha", "catherine"]
        List<String> expect1 = ListUtil.buildList(new String[]{"king", "andy", "matthew", "bob", "alex", "asha", "catherine"});
        assertEquals(expect1, result1);
        instance.death("bob"); // order: king > andy > matthew > bob > alex > asha > catherine
        List<String> result2 = instance.getInheritanceOrder(); // return ["king", "andy", "matthew", "alex", "asha", "catherine"]
        List<String> expect2 = ListUtil.buildList(new String[]{"king", "andy", "matthew", "alex", "asha", "catherine"});
        assertEquals(expect2, result2);

    }
}
