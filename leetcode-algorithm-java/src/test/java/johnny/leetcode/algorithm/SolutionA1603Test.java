package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1603Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("parkingSystem");

        SolutionA1603 parkingSystem = new SolutionA1603(1, 1, 0);
        assertEquals(true, parkingSystem.addCar(1)); // return true because there is 1 available slot for a big car
        assertEquals(true, parkingSystem.addCar(2)); // return true because there is 1 available slot for a medium car
        assertEquals(false, parkingSystem.addCar(3)); // return false because there is no available slot for a small car
        assertEquals(false, parkingSystem.addCar(1)); // return false because there is no available slot for a big car. It is already occupied.
    }
}
