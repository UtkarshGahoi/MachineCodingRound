package org.example;

public class EmailNotification {
    String emailId;
    String type;
    String groupNotification;

    public EmailNotification(String emailId, String type, String groupNotification) {
        this.emailId = emailId;
        this.type = type;
        this.groupNotification = groupNotification;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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
