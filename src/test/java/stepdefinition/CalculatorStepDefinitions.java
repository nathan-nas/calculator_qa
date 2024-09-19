package stepdefinition;

import static org.junit.Assert.*;
import io.cucumber.java.en.*;

public class CalculatorStepDefinitions {

    private Calculator calculator;
    private double result;
    // private int gcdResult;
    // private int lcmResult;
    private Exception exception;

    @Given("I have a Calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    @When("I divide {int} by {int}")
    public void i_divide_by(int a, int b) {
        try {
            result = calculator.divide(a, b);
        } catch (IllegalArgumentException e) {
            exception = e;
        }
    }

    @Then("the result should be {double}")
    public void the_result_should_be(double expectedResult) {
        assertEquals(expectedResult, result, 0.01);
    }

    @Then("I should get an IllegalArgumentException with message {string}")
    public void i_should_get_an_illegal_argument_exception_with_message(String message) {
        assertNotNull(exception);
        assertEquals(message, exception.getMessage());
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(int a, int b) {
        result = calculator.subtract(b, a);
    }

    @Then("the subtraction result should be {int}")
    public void the_subtraction_result_should_be(int expectedResult) {
        assertEquals(expectedResult, (int) result);
    }

    @When("I calculate the GCD of {int} and {int}")
    public void i_calculate_the_gcd_of_and(int a, int b) {
        result = calculator.gcd(a, b);
    }

    @Then("the GCD result should be {int}")
    public void the_gcd_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }

    @When("I calculate the LCM of {int} and {int}")
    public void i_calculate_the_lcm_of_and(int a, int b) {
        result = calculator.lcm(a, b);
    }

    @Then("the LCM result should be {int}")
    public void the_lcm_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }

    // Step Definitions for multiply
    @When("I multiply {int} and {int}")
    public void i_multiply_and(int a, int b) {
        result = calculator.multiply(a, b);
    }

    @Then("the multiplication result should be {int}")
    public void the_multiplication_result_should_be(int expectedResult) {
        assertEquals(expectedResult, (int) result);
    }

    // Step Definitions for modulo
    @When("I calculate {int} modulo {int}")
    public void i_calculate_modulo(int a, int b) {
        try {
            result = calculator.mod(a, b);
        } catch (ArithmeticException e) {
            exception = e;
        }
    }

    @Then("the modulo result should be {int}")
    public void the_modulo_result_should_be(int expectedResult) {
        assertEquals(expectedResult, (int) result);
    }

    @Then("an ArithmeticException should be thrown with message {string}")
    public void an_arithmetic_exception_should_be_thrown_with_message(String message) {
        assertNotNull(exception);
        assertEquals(message, exception.getMessage());
    }

    // Step Definitions for power
    @When("I calculate {int} to the power of {int}")
    public void i_calculate_to_the_power_of(int base, int exponent) {
        result = calculator.power(base, exponent);
    }

    @Then("the power result should be {int}")
    public void the_power_result_should_be(int expectedResult) {
        assertEquals(expectedResult, (int) result);
    }
}
