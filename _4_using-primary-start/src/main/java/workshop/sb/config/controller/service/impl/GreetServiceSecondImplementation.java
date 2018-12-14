package workshop.sb.config.controller.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;
@Service
@Primary
public class GreetServiceSecondImplementation implements GreetService {
    @Override
    public String getMsg() {
        return GreetService.MSG + "Hej jestem GreetServiceSecondImplementation";
    }
}
