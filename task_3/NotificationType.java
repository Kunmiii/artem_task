package artem_task.task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class NotificationType {
    private ArrayList<String> pushTypes;
    private String messageType = "simple";

    public NotificationType(String pushType, String messageType){
        this.pushTypes = new ArrayList<>(Arrays.asList("simpleMode"));
        this.pushTypes.add(pushType);
        this.messageType = messageType;
    }

    public NotificationType(){
        this.pushTypes = new ArrayList<>(Arrays.asList("simpleMode"));
        this.messageType = getMessageType();
    }

    public ArrayList<String> getPushTypes() {
        return pushTypes;
    }

    public String getMessageType() {
        return messageType;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[ ");
        try {
            for (int i = 0; i < pushTypes.size(); i++) {
                result.append(pushTypes.get(i));
                if (i < pushTypes.size() - 1) {
                    result.append(", ");
                }
            }
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        result.append(" ]");
        return result.toString();
    }

}
