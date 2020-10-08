package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1604Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("alertNames");
        SolutionA1604 instance = new SolutionA1604();

        List<String> expect1 = ListUtil.buildList(new String[]{"daniel"});
        assertEquals(expect1, instance.alertNames(new String[]{"daniel","daniel","daniel","luis","luis","luis","luis"}, new String[]{"10:00","10:40","11:00","09:00","11:00","13:00","15:00"}));

        List<String> expect2 = ListUtil.buildList(new String[]{"bob"});
        assertEquals(expect2, instance.alertNames(new String[]{"alice","alice","alice","bob","bob","bob","bob"}, new String[]{"12:01","12:00","18:00","21:00","21:20","21:30","23:00"}));

        List<String> expect3 = ListUtil.buildList(new String[]{});
        assertEquals(expect3, instance.alertNames(new String[]{"john","john","john"}, new String[]{"23:58","23:59","00:01"}));

        List<String> expect4 = ListUtil.buildList(new String[]{"clare","leslie"});
        assertEquals(expect4, instance.alertNames(new String[]{"leslie","leslie","leslie","clare","clare","clare","clare"}, new String[]{"13:00","13:20","14:00","18:00","18:51","19:30","19:49"}));
    }
}
