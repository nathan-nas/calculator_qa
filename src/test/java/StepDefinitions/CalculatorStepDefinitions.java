package StepDefinitions;

import static org.junit.Assert.*;
import io.cucumber.java.en.*;

public class CalculatorStepDefinitions {

    private Calculator calculator;
    private double result;
    private int gcdResult;
    private int lcmResult;
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

}
