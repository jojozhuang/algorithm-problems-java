package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionA3020Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findLeastNumOfUniqueInts");
        SolutionA3020 instance = new SolutionA3020();

        assertArrayEquals(new String[]{"kaido","kaido(1)","kaido(2)","kaido(1)(1)","kaido(2)(1)"}, instance.getFolderNames(new String[]{"kaido","kaido(1)","kaido","kaido(1)","kaido(2)"}));
        assertArrayEquals(new String[]{"pes","fifa","gta","pes(2019)"}, instance.getFolderNames(new String[]{"pes","fifa","gta","pes(2019)"}));
        assertArrayEquals(new String[]{"gta","gta(1)","gta(2)","avalon"}, instance.getFolderNames(new String[]{"gta","gta(1)","gta","avalon"}));
        assertArrayEquals(new String[]{"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"}, instance.getFolderNames(new String[]{"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"}));
        assertArrayEquals(new String[]{"wano","wano(1)","wano(2)","wano(3)"}, instance.getFolderNames(new String[]{"wano","wano","wano","wano"}));
        assertArrayEquals(new String[]{"kaido","kaido(1)","kaido(2)","kaido(1)(1)"}, instance.getFolderNames(new String[]{"kaido","kaido(1)","kaido","kaido(1)"}));

    }
}
