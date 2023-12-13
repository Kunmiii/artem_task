package artem_task.task_3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        NotificationType newPushType = new NotificationType("compositeMode", "timed");
        ChannelType newChannel = new ChannelType();
        Notifications alert = new Notifications(newPushType, newChannel);

        String result = alert.pushNotification("Hi, this is a test message ", LocalDateTime.now());
        String result2 = alert.pushNotification("Hi, this is a test message ");
        System.out.println(result);
        System.out.println(result2);

    }
}
