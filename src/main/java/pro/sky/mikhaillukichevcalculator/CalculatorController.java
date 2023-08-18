package pro.sky.mikhaillukichevcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public  CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path="/calculator")
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping(path="/calculator/plus")
    public String summarize(@RequestParam(value = "num1",required=false) Integer num1, @RequestParam(value = "num2",required=false) Integer num2) {
        if (num1 == null) {
            return "Please enter first number as num1";
        }
        if (num2 == null) {
            return "Please enter second number as num2";
        }
        return calculatorService.summarize(num1,num2);
    }

    @GetMapping(path="/calculator/minus")
    public String subtract(@RequestParam(value = "num1",required=false) Integer num1, @RequestParam(value = "num2",required=false) Integer num2) {
        if (num1 == null) {
            return "Please enter first number as num1";
        }
        if (num2 == null) {
            return "Please enter second number as num2";
        }
        return calculatorService.subtract(num1,num2);
    }

    @GetMapping(path="/calculator/multiply")
    public String multiply(@RequestParam(value = "num1",required=false) Integer num1, @RequestParam(value = "num2",required=false) Integer num2) {
        if (num1 == null) {
            return "Please enter first number as num1";
        }
        if (num2 == null) {
            return "Please enter second number as num2";
        }
        return calculatorService.multiply(num1,num2);
    }

    @GetMapping(path="/calculator/divide")
    public String divide(@RequestParam(value = "num1",required=false) Integer num1, @RequestParam(value = "num2",required=false) Integer num2) {
        if (num1 == null) {
            return "Please enter first number as num1";
        }
        if (num2 == null) {
            return "Please enter second number as num2";
        }
        return calculatorService.divide(num1,num2);
    }
}
