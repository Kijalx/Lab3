package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){
        userService.registerUser(name, email);
        return "User registered successfully";
    }

    @PostMapping("/registerUserBody")
    public String getUserFromBody(@RequestBody UserRequest request){
        String name = request.getName();
        String email = request.getEmail();
        userService.registerUser(name, email);

        return "User registered successfully";

    }
}
