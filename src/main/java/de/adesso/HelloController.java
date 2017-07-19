package de.adesso;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ndanji-ngassa on 19.07.2017.
 */
@RestController
public class HelloController {
    @RequestMapping(value="/hello")
    public String hello(){
        return "Hello adesso aus Microservice-world";
    }
}
