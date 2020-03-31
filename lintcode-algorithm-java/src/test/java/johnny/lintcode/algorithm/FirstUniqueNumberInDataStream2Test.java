package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstUniqueNumberInDataStream2Test extends JunitBase {

    @Test
    public void testFirstUniqueNumber() {
        System.out.println("firstUniqueNumber");
        FirstUniqueNumberInDataStream2 instance = new FirstUniqueNumberInDataStream2();
        instance.add(1);
        instance.add(2);
        assertEquals(1, instance.firstUnique());
        instance.add(1);
        assertEquals(2, instance.firstUnique());

        FirstUniqueNumberInDataStream2 instance2 = new FirstUniqueNumberInDataStream2();
        instance2.add(1);
        instance2.add(2);
        instance2.add(3);
        instance2.add(4);
        instance2.add(5);
        assertEquals(1, instance2.firstUnique());
        instance2.add(1);
        assertEquals(2, instance2.firstUnique());
        instance2.add(2);
        assertEquals(3, instance2.firstUnique());
        instance2.add(3);
        assertEquals(4, instance2.firstUnique());
        instance2.add(4);
        assertEquals(5, instance2.firstUnique());
        instance2.add(5);
        instance2.add(6);
        assertEquals(6, instance2.firstUnique());
    }
    
}
