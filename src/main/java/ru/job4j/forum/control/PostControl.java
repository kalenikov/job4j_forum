package ru.job4j.forum.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.service.PostService;

import java.util.Optional;

@Controller
public class PostControl {

    @Autowired
    private PostService posts;

    @GetMapping("/post")
    public String doGet(Model model, @RequestParam Optional<Integer> id) {
        if (id.isPresent()) {
            model.addAttribute("post", posts.findById(id.get()).get());
            return "post";
        } else {
            model.addAttribute("post", new Post());
            return "edit";
        }
    }

    @PostMapping("/post")
    public String doPost(@ModelAttribute Post post) {
        posts.save(post);
        return "redirect:/index";
    }
}
