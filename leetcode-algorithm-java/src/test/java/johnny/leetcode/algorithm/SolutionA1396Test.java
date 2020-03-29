package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1396Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("undergroundSystem");
        SolutionA1396 undergroundSystem = new SolutionA1396();

        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        assertEquals(undergroundSystem.getAverageTime("Paradise", "Cambridge"), 14.0, 0.00001);       // return 14.0. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
        assertEquals(undergroundSystem.getAverageTime("Leyton", "Waterloo"), 11.0, 0.00001);          // return 11.0. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.0
        undergroundSystem.checkIn(10, "Leyton", 24);
        assertEquals(undergroundSystem.getAverageTime("Leyton", "Waterloo"), 11.0, 0.00001);          // return 11.0
        undergroundSystem.checkOut(10, "Waterloo", 38);
        assertEquals(undergroundSystem.getAverageTime("Leyton", "Waterloo"), 12.0, 0.00001);          // return 12.0
    }
}
