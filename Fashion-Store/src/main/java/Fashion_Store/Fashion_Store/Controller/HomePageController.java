package Fashion_Store.Fashion_Store.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String getHomePage(Model model) {
        return "home";
    }

}
