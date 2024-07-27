/*
    Source code is based on the material from Katalon:
    https://github.com/katalon-studio/testops-junit4
 */

import org.junit.Assume;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

// This is a test class for the Calculator class.
public class CalculatorJUnit4Test {
    
    // This is a Calculator object that will be used in the tests.
    private Calculator calculator;

    // This method is executed before each test. It initializes the Calculator object.
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    // This test checks if the add method in the Calculator class works correctly.
    @Test
    public void add() {
        assertEquals(377, calculator.add(365, 12));
        assertEquals(377, calculator.add(12, 365));
    }

    // This test checks if the subtract method in the Calculator class works correctly.
    @Test
    public void subtract() {
        assertEquals(353, calculator.subtract(365, 12));
        assertEquals(-353, calculator.subtract(12, 365));
    }

    // This test checks if the multiply method in the Calculator class works correctly.
    @Test
    public void multiply() {
        assertEquals(4380, calculator.multiply(365, 12));
        assertEquals(4380, calculator.multiply(12, 365));
    }

    // This test checks if the divide method in the Calculator class works correctly.
    @Test
    public void divide() {
        assertEquals(36.5, calculator.divide(365, 10), 0);
    }

    // This test checks if the divide method in the Calculator class throws an IllegalArgumentException when the divisor is zero.
    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroPassed() {
        calculator.divide(365, 0);
    }

    // This test checks if the divide method in the Calculator class throws an IllegalArgumentException when the divisor is zero.
    @Test
    public void divideByZeroFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(365, 0);
        });
    }
    
    // This test will fail because the divide method in the Calculator class throws an IllegalArgumentException when the divisor is zero.
    // Disable this test to make all tests are passed.
    //@Test
    //public void divideByZeroError() {
    //    calculator.divide(365, 0);
    //}

    // This test is ignored and will not be executed.
    @Ignore(value = "this test is ignored")
    @Test
    public void divideByZeroSkipped() {
        calculator.divide(365, 0);
    }
}

