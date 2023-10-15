package pro.sky.mikhaillukichevcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greeting() {
        return "Welcome to calculator!<br>" +
                "Replace xxx with the numbers to get the results.<br>" +
                "You can use the following commands:<br>" +
                "Summarize: /calculator/plus?num1=xxx&num2=xxx<br>" +
                "Subtract: /calculator/minus?num1=xxx&num2=xxx<br>" +
                "Multiple: /calculator/multiply?num1=xxx&num2=xxx<br>" +
                "Divide: /calculator/divide?num1=xxx&num2=xxx";
    }

    public String summarize(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String subtract(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " x " + num2 + " = " + result;
    }

    public String divide(int num1, int num2) {
        if (num2 != 0) {
            double result = (double) num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        } else {
            return num1 + " / " + num2 + " = cannot divide by zero";
        }
    }
}
