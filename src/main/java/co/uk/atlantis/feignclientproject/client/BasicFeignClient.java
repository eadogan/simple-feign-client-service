package co.uk.atlantis.feignclientproject.client;

import co.uk.atlantis.feignclientproject.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "basicFeignClient",  url = "${spring.service.base-url}")
public interface BasicFeignClient {

    @GetMapping("/users")
    List<User> getAllUsers();

    @GetMapping("/users/{id}")
    User getById(@PathVariable int id);
}
