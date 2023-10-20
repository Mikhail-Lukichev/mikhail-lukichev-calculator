package pro.sky.mikhaillukichevcalculator.service;

import org.springframework.stereotype.Service;
import pro.sky.mikhaillukichevcalculator.exception.DivideByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private String formatResult(int num1, int num2, String operation, String result) {
        return String.format("%s %s %s = %s",num1, operation, num2, result);
    }

    public String greeting() {
        return "Welcome to the calculator!";
    }

    public String summarize(int num1, int num2) {
        int sum = num1 + num2;
        return formatResult(num1,num2, "+",Integer.toString(sum));
    }

    public String subtract(int num1, int num2) {
        int result = num1 - num2;
        return formatResult(num1,num2, "-",Integer.toString(result));
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return formatResult(num1,num2, "x",Integer.toString(result));
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) throw new DivideByZeroException("Cannot divide by zero");
        double result = (double) num1 / num2;
        return formatResult(num1,num2, "/",Double.toString(result));
    }
}
