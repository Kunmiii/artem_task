package artem_task.task_3;

import java.time.LocalDateTime;

public class Notifications implements Notification {
    NotificationType notificationType;
    ChannelType channelType;
    public Notifications(NotificationType notificationType, ChannelType newChannel){
        this.notificationType = notificationType;
        this.channelType = newChannel;
    }

    @Override
    public String pushNotification(String message, LocalDateTime messageTimestamp) {

        if (notificationType != null) {
            String result = "";
            for (int i = 0; i < channelType.getChannels().size(); i++) {
                result += "message: " + notificationType.getPushTypes().get(1) + "{time=" + messageTimestamp + ", text='"
                        + notificationType.getMessageType() + "'} " + "was sent to " + channelType.getChannels().get(i);
                result += "\n";
            }
        return result;
        }
        return "notification type is null";
    }

    @Override
    public String pushNotification(String message) {
        String result = "";
        for (int i = 0; i < channelType.getChannels().size(); i++) {
            result += "message: " + notificationType.getPushTypes().get(0) + "{text='"
                + notificationType.getMessageType() +  "'} " + "was sent to " + channelType.getChannels().get(i);
            result += "\n";
        }
        return result;
    }
}


