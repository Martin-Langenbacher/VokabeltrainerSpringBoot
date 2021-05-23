package de.telespring.vokabeltrainer.controller;

import de.telespring.vokabeltrainer.model.User;
import de.telespring.vokabeltrainer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser (@RequestBody User user) {
        return this.userRepository.save(user);
    }
}
