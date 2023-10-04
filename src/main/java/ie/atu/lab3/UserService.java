package ie.atu.lab3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService;
    }

    public void registerUser(String username, String email){
        emailService.sendEmail(email,"Welcome");
    }
}
