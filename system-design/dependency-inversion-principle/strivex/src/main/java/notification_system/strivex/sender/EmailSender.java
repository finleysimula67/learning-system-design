package notification_system.strivex.sender;

import org.springframework.stereotype.Service;

@Service
public class EmailSender implements MessageSender {
    public void send(String recipient, String message) {
        System.out.printf("[EMAIL] To: %s | %s%n", recipient, message);
    }
    public String getType() { return "email"; }
}
