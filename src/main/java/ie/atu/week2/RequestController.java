package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    public String hello(){
        return "Hello";
    }
}
