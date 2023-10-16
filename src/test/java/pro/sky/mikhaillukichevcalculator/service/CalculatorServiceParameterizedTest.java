package pro.sky.mikhaillukichevcalculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.mikhaillukichevcalculator.TestUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParameterizedTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of("2", "3", TestUtils.formatResult(2, 3, "+", String.valueOf(2 + 3))),
                Arguments.of("10", "3", TestUtils.formatResult(10, 3, "+", String.valueOf(10 + 3))),
                Arguments.of("-20", "-10", TestUtils.formatResult(-20, -10, "+", String.valueOf(-20 - 10)))
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void summarize(int num1, int num2, String result) {
        assertEquals(result, out.summarize(num1, num2));
    }

    public static Stream<Arguments> subtractParams() {
        return Stream.of(
                Arguments.of("2", "3", TestUtils.formatResult(2, 3, "-", String.valueOf(2 - 3))),
                Arguments.of("10", "3", TestUtils.formatResult(10, 3, "-", String.valueOf(10 - 3))),
                Arguments.of("-20", "-10", TestUtils.formatResult(-20, -10, "-", String.valueOf(-20 - -10)))
        );
    }

    @ParameterizedTest
    @MethodSource("subtractParams")
    void subtract(int num1, int num2, String result) {
        assertEquals(result, out.subtract(num1, num2));
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of("2", "3", TestUtils.formatResult(2, 3, "x", String.valueOf(2 * 3))),
                Arguments.of("10", "3", TestUtils.formatResult(10, 3, "x", String.valueOf(10 * 3))),
                Arguments.of("-20", "-10", TestUtils.formatResult(-20, -10, "x", String.valueOf(-20 * -10)))
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, out.multiply(num1, num2));
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of("10", "2", TestUtils.formatResult(10, 2, "/", String.valueOf((double) 10 / 2))),
                Arguments.of("20", "5", TestUtils.formatResult(20, 5, "/", String.valueOf((double) 20 / 5))),
                Arguments.of("200", "-10", TestUtils.formatResult(200, -10, "/", String.valueOf((double) 200 / -10)))
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String result) {
        assertEquals(result, out.divide(num1, num2));
    }
}