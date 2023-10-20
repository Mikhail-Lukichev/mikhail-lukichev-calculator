package pro.sky.mikhaillukichevcalculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.mikhaillukichevcalculator.TestUtils;
import pro.sky.mikhaillukichevcalculator.exception.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    void greeting_success() {
        //Expected result preparation
        String expectedResult = "Welcome to the calculator!";

        //Test execution
        String actualResult = out.greeting();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void summarize_success() {
        //Data preparation
        int num1 = 5;
        int num2 = 10;

        //Expected result preparation
        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        //Test execution
        String actualResult = out.summarize(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void summarize_success2() {
        //Data preparation
        int num1 = -10;
        int num2 = -20;

        //Expected result preparation
        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        //Test execution
        String actualResult = out.summarize(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void subtract_success() {
        //Data preparation
        int num1 = 10;
        int num2 = 5;

        //Expected result preparation
        String expectedResult = TestUtils.formatResult(num1, num2, "-", String.valueOf(num1 - num2));

        //Test execution
        String actualResult = out.subtract(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success() {
        //Data preparation
        int num1 = 10;
        int num2 = 5;

        //Expected result preparation
        String expectedResult = TestUtils.formatResult(num1, num2, "x", String.valueOf(num1 * num2));

        //Test execution
        String actualResult = out.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {
        //Data preparation
        int num1 = 10;
        int num2 = 5;

        //Expected result preparation
        String expectedResult = TestUtils.formatResult(num1, num2, "/", String.valueOf((double) num1 / num2));

        //Test execution
        String actualResult = out.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withException() {
        //Data preparation
        int num1 = 10;
        int num2 = 0;

        //Expected result preparation
        String expectedMessage = "Cannot divide by zero";

        //Test execution
        Exception exception = assertThrows(DivideByZeroException.class,
                () -> out.divide(num1, num2)
                );
        assertEquals(expectedMessage,exception.getMessage());
    }
}