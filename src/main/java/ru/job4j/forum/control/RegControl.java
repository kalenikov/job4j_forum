package ru.job4j.forum.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.job4j.forum.model.User;
import ru.job4j.forum.service.UserService;

@Controller
public class RegControl {

    @Autowired
    UserService users;

    @GetMapping("/reg")
    protected String doGet() {
        return "reg";
    }

    @PostMapping("/reg")
    protected ModelAndView doPost(@ModelAttribute User user) {
        if (users.findByName(user.getUsername()).isEmpty()) {
            users.save(user);
            return new ModelAndView("login");
        } else {
            return new ModelAndView("reg")
                    .addObject("errorMessage", "This username already exists");
        }
    }
}
