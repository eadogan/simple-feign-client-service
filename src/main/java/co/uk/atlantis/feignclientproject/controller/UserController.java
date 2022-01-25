package co.uk.atlantis.feignclientproject.controller;

import co.uk.atlantis.feignclientproject.client.BasicFeignClient;
import co.uk.atlantis.feignclientproject.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private BasicFeignClient feignClient;

    public UserController(BasicFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return feignClient.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id) {
        return feignClient.getById(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return feignClient.createUser(user);
    }

    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable int id) {
        return feignClient.deleteByUserId(id);
    }
}
