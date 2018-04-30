import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer testPrinter;

    @Before
    public void before() {
        testPrinter = new Printer(50, 100);
    }

    @Test
    public void printRequestTest(){
        assertEquals(true, testPrinter.printRequest(4,10));
    }

    @Test
    public void printRequestFail() {
        assertEquals(false, testPrinter.printRequest(6,10));
    }

    @Test
    public void refillPrinterTest() {
        assertEquals("Printer refilled, 100 sheets available", testPrinter.refillPrinter(50));
    }

    @Test
    public void tonerReduceCheck() {
        testPrinter.printRequest(2,5);
        assertEquals(90, testPrinter.getTonerVolume());
    }

}
