package StepDefinitions;

import static org.junit.Assert.*;
import io.cucumber.java.en.*;

public class CalculatorStepDefinitions {

    private Calculator calculator;
    private int result;

    // Initialize the calculator instance
    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    // Perform addition operation
    @When("I add {int} and {int}")
    public void i_add_and(Integer num1, Integer num2) {
        result = calculator.add(num1, num2);
    }

    // Check the result
    @Then("the result should be {int}")
    public void the_result_should_be(Integer expectedResult) {
        assertEquals((int) expectedResult, result);
    }
}
