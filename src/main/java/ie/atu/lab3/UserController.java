package ie.atu.lab3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("registerUser/{name}/{email}")
    public void registerUser(String username, String email){

    }
}
