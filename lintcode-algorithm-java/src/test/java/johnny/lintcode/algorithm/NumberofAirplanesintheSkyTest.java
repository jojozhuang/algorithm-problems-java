package johnny.lintcode.algorithm;

import johnny.algorithm.common.Interval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class NumberofAirplanesintheSkyTest extends JunitBase  {

    /**
     * Test of countOfAirplanes method, of class NumberofAirplanesintheSky.
     */
    @Test
    public void testCountOfAirplanes() {
        System.out.println("countOfAirplanes");
        List<Interval> airplanes = null;
        NumberofAirplanesintheSky instance = new NumberofAirplanesintheSky();
        int expResult = 0;
        int result = instance.countOfAirplanes(airplanes);
        assertEquals(expResult, result);
        
        List<Interval> airplanes2 = new ArrayList<Interval>();
        airplanes2.add(new Interval(1, 10));
        airplanes2.add(new Interval(2, 3));       
        airplanes2.add(new Interval(4, 7));
        airplanes2.add(new Interval(5, 8));
        assertEquals(3, instance.countOfAirplanes(airplanes2));
        
        //[[10,14],[10,15],[10,16],[1,10],[2,10],[3,10],[4,10]]
        List<Interval> airplanes3 = new ArrayList<Interval>();
        airplanes3.add(new Interval(10, 14));
        airplanes3.add(new Interval(10, 15));       
        airplanes3.add(new Interval(10, 16));
        airplanes3.add(new Interval(1, 10));
        airplanes3.add(new Interval(2, 10));
        airplanes3.add(new Interval(3, 10));
        airplanes3.add(new Interval(4, 10));
        assertEquals(4, instance.countOfAirplanes(airplanes3));
    }
    
}
