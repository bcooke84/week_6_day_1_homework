import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottleTest;

    @Before
    public void before() {
        waterBottleTest = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottleTest.getVolume());
    }

    @Test
    public void takesDrink() {
        assertEquals(90, waterBottleTest.drink());
    }

    @Test
    public void emptyWaterBottle() {
        assertEquals(0, waterBottleTest.empty());
    }

    @Test
    public void fillWaterBottle() {
        waterBottleTest.empty();
        assertEquals(100, waterBottleTest.fill());
    }



}
