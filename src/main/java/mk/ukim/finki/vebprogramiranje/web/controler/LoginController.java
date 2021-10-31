package mk.ukim.finki.vebprogramiranje.web.controler;

import mk.ukim.finki.vebprogramiranje.model.User;
import mk.ukim.finki.vebprogramiranje.model.exceptions.InvalidUserCredentialsException;
import mk.ukim.finki.vebprogramiranje.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public String getLoginPage() {
        return "login";
    }

    @PostMapping
    public String login(@RequestParam String username, @RequestParam String password, HttpServletRequest request,
                        Model model) {
        User user = null;
        try {
            user = authService.login(username, password);
            request.getSession().setAttribute("user", user);
            return "redirect:/home";
        } catch (InvalidUserCredentialsException e) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }
}
