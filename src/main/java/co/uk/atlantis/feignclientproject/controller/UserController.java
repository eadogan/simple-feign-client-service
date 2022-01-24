package co.uk.atlantis.feignclientproject.controller;

import co.uk.atlantis.feignclientproject.client.BasicFeignClient;
import co.uk.atlantis.feignclientproject.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
