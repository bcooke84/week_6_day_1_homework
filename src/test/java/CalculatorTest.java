import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(10, testCalculator.add(5,5));
    }

    @Test
    public void subtract() {
        assertEquals(5, testCalculator.subtract(10,5));
    }

    @Test
    public void divide() {
        assertEquals(2, testCalculator.divide(10,5));
    }

    @Test
    public void multiply() {
        assertEquals(20, testCalculator.multiply(4,5));
    }


}
