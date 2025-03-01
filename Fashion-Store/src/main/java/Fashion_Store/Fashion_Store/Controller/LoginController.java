package Fashion_Store.Fashion_Store.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/showLogin")
    public String showLoginPage() {
        
        return "login/login";
    }

}
