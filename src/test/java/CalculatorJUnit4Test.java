/*
    Source code is based on the material from Katalon:
    https://github.com/katalon-studio/testops-junit4
 */

// import org.junit.Assume;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",  // The location of your feature files
        glue = "StepDefinitions",        // The package where your step definitions are located
        plugin = {"pretty"}
)public class CalculatorJUnit4Test {

    // This is a Calculator object that will be used in the tests.
    private Calculator calculator;

    // This method is executed before each test. It initializes the Calculator
    // object.
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

    // This test checks if the subtract method in the Calculator class works
    // correctly.
    @Test
    public void subtract() {
        assertEquals(353, calculator.subtract(365, 12));
        assertEquals(-353, calculator.subtract(12, 365));
    }

    // This test checks if the multiply method in the Calculator class works
    // correctly.
    @Test
    public void multiply() {
        assertEquals(4380, calculator.multiply(365, 12));
        assertEquals(4380, calculator.multiply(12, 365));
    }

    // This test checks if the divide method in the Calculator class works
    // correctly.
    @Test
    public void divide() {
        assertEquals(36.5, calculator.divide(365, 10), 0);
    }

    // This test checks if the divide method in the Calculator class throws an
    // IllegalArgumentException when the divisor is zero.
    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroPassed() {
        calculator.divide(365, 0);
    }

    // This test checks if the divide method in the Calculator class throws an
    // IllegalArgumentException when the divisor is zero.
    @Test
    public void divideByZeroFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(365, 0);
        });
    }

    // This test will fail because the divide method in the Calculator class throws
    // an IllegalArgumentException when the divisor is zero.
    // Disable this test to make all tests are passed.
    // @Test
    // public void divideByZeroError() {
    // calculator.divide(365, 0);
    // }

    // This test is ignored and will not be executed.
    @Ignore(value = "this test is ignored")
    @Test
    public void divideByZeroSkipped() {
        calculator.divide(365, 0);
    }

    @Test
    public void testGcdSuccess() {
        assertEquals(6, calculator.gcd(12, 18)); // GCD of 12 and 18 is 6
        assertEquals(1, calculator.gcd(17, 13)); // GCD of 17 and 13 is 1 (prime numbers)
        assertEquals(5, calculator.gcd(10, 5)); // GCD of 10 and 5 is 5
        assertEquals(14, calculator.gcd(42, 56)); // GCD of 42 and 56 is 14
        assertEquals(1, calculator.gcd(8, 15)); // GCD of 8 and 15 is 1
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGcdFailure() {
        // Test for invalid inputs like negative numbers
        calculator.gcd(-12, 18); // Negative number case should throw exception
    }

    // Test for LCM function
    @Test
    public void testLcmSuccess() {
        assertEquals(36, calculator.lcm(12, 18)); // LCM of 12 and 18 is 36
        assertEquals(221, calculator.lcm(17, 13)); // LCM of 17 and 13 is 221
        assertEquals(10, calculator.lcm(10, 5)); // LCM of 10 and 5 is 10
        assertEquals(168, calculator.lcm(42, 56)); // LCM of 42 and 56 is 168
        assertEquals(120, calculator.lcm(8, 15)); // LCM of 8 and 15 is 120
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLcmFailure() {
        // Test for invalid inputs like zero or negative numbers
        calculator.lcm(0, 18); // LCM with zero should throw an exception
    }

    // Test for Fibonacci function
    @Test
    public void testFibonacciSuccess() {
        assertEquals(0, calculator.fibonacci(0)); // Fibonacci of 0 is 0
        assertEquals(1, calculator.fibonacci(1)); // Fibonacci of 1 is 1
        assertEquals(1, calculator.fibonacci(2)); // Fibonacci of 2 is 1
        assertEquals(2, calculator.fibonacci(3)); // Fibonacci of 3 is 2
        assertEquals(3, calculator.fibonacci(4)); // Fibonacci of 4 is 3
        assertEquals(13, calculator.fibonacci(7)); // Fibonacci of 7 is 13
        assertEquals(55, calculator.fibonacci(10)); // Fibonacci of 10 is 55
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciFailure() {
        // Test for invalid inputs like negative Fibonacci indices
        calculator.fibonacci(-5); // Fibonacci of negative number should throw exception
    }
}
