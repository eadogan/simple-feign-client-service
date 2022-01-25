package co.uk.atlantis.feignclientproject.client;

import co.uk.atlantis.feignclientproject.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "basicFeignClient",  url = "${spring.service.base-url}")
public interface BasicFeignClient {

    @GetMapping("/users")
    List<User> getAllUsers();

    @GetMapping("/users/{id}")
    User getById(@PathVariable int id);

    @PostMapping("/users")
    User createUser(User user);

    @DeleteMapping("/users/{id}")
    User deleteByUserId(@PathVariable int id);
}
