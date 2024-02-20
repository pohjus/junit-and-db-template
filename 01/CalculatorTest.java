
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Calculator}.
 */
public class CalculatorTest {

    /**
     * Tests the sum method of the Calculator class.
     */
    @Test
    public void testSum() {
        assertEquals(5, Calculator.sum(2, 3), "2 + 3 should equal 5");
    }
}