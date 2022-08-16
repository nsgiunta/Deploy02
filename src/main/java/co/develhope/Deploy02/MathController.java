package co.develhope.Deploy02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @Autowired
    private Environment environment;

    @GetMapping("/sum")
    public double sum(){
       double random1 = Math.random();
        double random2 = Math.random();
       return random1 + random2;
    }
}
