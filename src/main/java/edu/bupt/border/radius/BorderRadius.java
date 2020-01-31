package edu.bupt.border.radius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiahui
 * @date 2020/1/31
 */
@Controller
@SpringBootApplication
public class BorderRadius {
    public static void main(String[] args) {
        SpringApplication.run(BorderRadius.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
