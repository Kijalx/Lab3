package ie.atu.lab3;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class EmailService {
    public void sendEmail(String to, String message){
        System.out.println(to + " " + message);
    }
}
