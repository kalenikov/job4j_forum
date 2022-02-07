package ru.job4j.forum.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.job4j.forum.model.User;
import ru.job4j.forum.service.UserService;

@Controller
public class RegControl {

    private final UserService users;

    public RegControl(UserService users) {
        this.users = users;
    }

    @GetMapping("/reg")
    protected String doGet(Model model) {
        model.addAttribute("user", new User());
        return "reg";
    }

    @PostMapping("/reg")
    protected String doPost(@ModelAttribute User user, Model model) {
        if (!users.save(user)) {
            model.addAttribute("errorMessage", "This username already exists");
            return "reg";
        }
        return "redirect:/login?reg=true";
    }
}
