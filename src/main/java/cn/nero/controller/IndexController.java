package cn.nero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nero Claudius
 * @version 1.0.0
 * @Date 2023/4/30
 */
@RestController
@RequestMapping("")
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return """
                {
                    "message": "bootstrap successfully!"
                }
                """;
    }

}
