package notification_system.strivex.controller;

import notification_system.strivex.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    private final NotificationService svc;

    public NotificationController(NotificationService svc) {
        this.svc = svc;
    }

    @PostMapping
    public ResponseEntity<String> send(@RequestBody NotifyRequest req) {
        svc.notify(req.type(), req.recipient(), req.message());
        return ResponseEntity.ok("Sent via " + req.type());
    }

    @PostMapping("/all")
    public ResponseEntity<String> sendAll(@RequestBody NotifyRequest req) {
        svc.notifyAll(req.recipient(), req.message());
        return ResponseEntity.ok("Broadcast sent");
    }

    record NotifyRequest(String type, String recipient, String message) {}
}