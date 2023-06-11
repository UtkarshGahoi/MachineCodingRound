package org.example;

public class WhatsAppNotification extends Notification{
    String mobNo;
    String type;
    String groupNotification;

    public WhatsAppNotification(String mobNo, String type, String groupNotification) {
        System.out.println("Here for the whats app msg");
        this.mobNo = mobNo;
        this.type = type;
        this.groupNotification = groupNotification;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroupNotification() {
        return groupNotification;
    }

    public void setGroupNotification(String groupNotification) {
        this.groupNotification = groupNotification;
    }
}
