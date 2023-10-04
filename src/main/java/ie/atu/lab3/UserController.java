package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){
        userService.registerUser(name, email);
        return "User registered successfully";
    }
}
