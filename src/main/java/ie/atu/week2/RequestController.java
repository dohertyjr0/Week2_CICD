package ie.atu.week2;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello "+name + "!";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return "Name:  "+name+", Age "+age+"!";
    }

    @GetMapping("/person")
    public Person getPerson(){
        return new Person("John",23);
    }

    @GetMapping("/calculate")
    public Calculate getOperation(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation){

        double total = 0;

        switch(operation.toLowerCase()){
            case "add":
                total = num1 + num2;
                break;

            case "sub":
                total = num1 - num2;
                break;

            case "mul":
                total = num1 * num2;
                break;

            case "div":
                if(num2 == 0){
                    System.out.println("cannot divide by 0");
                }
                else{
                    total = num1/num2;
                }
        }
        return new Calculate(operation, total);
    }
}
