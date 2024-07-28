package sebasruiz.the_books_project_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/home")
    public String home() {
        return "Hello, welcome :D";
    }
}
