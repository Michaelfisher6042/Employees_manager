package hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class hello_wold {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!!";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(hello_wold.class, args);
    }


}
