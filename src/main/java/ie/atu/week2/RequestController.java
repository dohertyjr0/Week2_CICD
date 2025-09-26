package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    public String hello(){
        return "Hello";
    }

    public String greetByName(@PathVariable String name){
        return "Hello "+name + "!";
    }

    public String details(@RequestParam String name, @RequestParam int age){
        return "Name:  "+name+", Age "+age+"!";
    }
}
