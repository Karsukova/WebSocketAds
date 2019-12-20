package Calendar.Controllers;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileRestController {
    @MessageMapping("/file-changed")
    @SendTo("/topic/file-changes")
    public String change(@RequestBody String notificationBody) throws Exception {
        //Thread.sleep(1000); // simulated delay
        return notificationBody;
    }
}
