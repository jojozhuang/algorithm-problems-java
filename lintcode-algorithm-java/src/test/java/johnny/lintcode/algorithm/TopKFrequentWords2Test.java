package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopKFrequentWords2Test extends JunitBase {
    @Test
    public void testSomeMethod() {
        TopKFrequentWords2 instance = new TopKFrequentWords2(2);
        instance.add("lint");
        instance.add("code");
        instance.add("code");
        instance.add("coding");
        instance.add("coding");
        instance.add("coding");
        instance.add("lint");
        instance.add("lint");

        List<String> expect1 = ListUtil.buildList(new String[]{"coding","lint"});

        assertEquals(expect1, instance.topk());
    }
}
