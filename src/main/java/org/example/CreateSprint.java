package org.example;

import java.util.List;

public class CreateSprint {
    private List<Task>taskList;
     public void addTask(Task task){
         taskList.add(task);
     }
     public void removeTask(Task task){
         taskList.remove(task);
     }

}
