package Fashion_Store.Fashion_Store.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePageController {
    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

}
