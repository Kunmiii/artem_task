package artem_task.task_3;

import java.time.LocalDateTime;

public interface Notification {
    String pushNotification(String message, LocalDateTime messageTimestamp);
    String pushNotification(String message);
}
