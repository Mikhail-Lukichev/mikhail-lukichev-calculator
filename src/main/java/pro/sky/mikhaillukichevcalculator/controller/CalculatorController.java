package pro.sky.mikhaillukichevcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.mikhaillukichevcalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public  CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path="")
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping(path="/plus")
    public String summarize(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.summarize(num1,num2);
    }

    @GetMapping(path="/minus")
    public String subtract(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.subtract(num1,num2);
    }

    @GetMapping(path="/multiply")
    public String multiply(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.multiply(num1,num2);
    }

    @GetMapping(path="/divide")
    public String divide(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
        return calculatorService.divide(num1,num2);
    }
}
