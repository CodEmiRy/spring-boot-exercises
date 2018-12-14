package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {


    @Value("${hello}")
    String hello;
    @Value("${msg}")
    String msg;
    @Value("${foo}")
    String foo;
    // TODO 4 zdefiniuj pola hello, msg, foo, wstrzyknij do nich wartości używając @Value

    @GetMapping("/hello")
    public String hello() {
        return hello;
    }
    @GetMapping("/msg")
    public String msg() {
        return msg;
    }
    @GetMapping("/foo")
    public String foo() {
        return foo;
    }
    // TODO 5 utwórz metodę obsługującą GET, "/hello"

    // TODO 7 utwórz metodę obsługującą GET, "/msg"

    // TODO 9 utwórz metodę obsługującą GET, "/foo"
}


