package org.example;

public class Task {
    String taskName;
    String assignee;
    String desc;

    public Task(String taskName, String assignee, String desc) {
        this.taskName = taskName;
        this.assignee = assignee;
        this.desc = desc;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
