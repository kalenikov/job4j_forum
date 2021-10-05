package ru.job4j.forum.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.forum.service.UserService;

@Controller
public class LoginControl {

    @Autowired
    private UserService users;

    @GetMapping("/login")
    protected String doGet() {
        return "login";
    }
}
