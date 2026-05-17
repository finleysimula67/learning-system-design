package notification_system.strivex.service;

import notification_system.strivex.sender.MessageSender;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class NotificationService {

    private final Map<String, MessageSender> senderMap;

    // Spring injects ALL MessageSender beans automatically
    public NotificationService(List<MessageSender> senders) {
        senderMap = senders.stream().collect(
                Collectors.toMap(MessageSender::getType, s -> s)
        );
    }

    public void notify(String type, String recipient, String message) {
        Optional.ofNullable(senderMap.get(type.toLowerCase()))
                .orElseThrow(() -> new IllegalArgumentException(
                        "Unknown channel: " + type))
                .send(recipient, message);
    }

    public void notifyAll(String recipient, String message) {
        senderMap.values().forEach(s -> s.send(recipient, message));
    }
}