package notification_system.strivex.sender;

public interface MessageSender {
    void send(String recipient, String message);
    String getType();
}

