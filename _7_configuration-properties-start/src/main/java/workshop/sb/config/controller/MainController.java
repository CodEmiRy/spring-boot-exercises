package workshop.sb.config.controller;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "test1.property1")
public class MainController {

    private String foo;
    private String bar;
    private int x;

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public void setX(int x) {
        this.x = x;
    }

    @GetMapping("/foo")
    public String foo() {
        return foo;
    }

    @GetMapping("/bar")
    public String bar() {
        return bar;
    }

    @GetMapping("/x")
    public int x() {
        return x;
    }
}
