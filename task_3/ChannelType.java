package artem_task.task_3;

import java.util.ArrayList;

public class ChannelType implements Channels {
    private String newChannelType;
    private ArrayList<String> channels = new ArrayList<>();

    ChannelType(String newChannelType){
        this.newChannelType = newChannelType;
    }
    ChannelType(){
        this.channels.add("Mobile");
        this.channels.add("Web");
        this.channels.add("Email");
    }

    /*public String getChannelType1() {
        return "Mobile";
    }
    public String getChannelType2(){
        return "Web";
    }
    public String getChannelType3() {
        return "Email";
    }*/

    public void setNewChannelType(String newChannelType) {
        this.newChannelType = newChannelType;
    }

    public ArrayList<String> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<String> channels) {
        this.channels = channels;
    }
}
