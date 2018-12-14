package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    @GetMapping("/")
    public String homes() {
        return "Napisz w URL \b aby dodać - /add/1/2 \b aby odjąć - /min/1/2 \b aby podzielić - /div?a=1&b=2 \b aby pomnożyć  - /mul?a=1&b=2  ";
    }

    @GetMapping("/add/{a}/{b}")
    public double add(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    @GetMapping("/min/{a}/{b}")
    public double min(@PathVariable double a, @PathVariable double b) {
        return a - b;
    }

    @GetMapping("/div")
    public double div(@RequestParam double a, @RequestParam double b) {
        return a / b;
    }

    @GetMapping("/mul")
    public String mul(@RequestParam double a, @RequestParam double b) {
        return String.valueOf(a * b);
    }

}
