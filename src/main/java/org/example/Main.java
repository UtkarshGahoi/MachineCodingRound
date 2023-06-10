package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String type="story";
        if(type.equalsIgnoreCase("Story")){
            Story story=new Story();
            System.out.println(story.getTicket());
        }
        Bug bug=new Bug();
        bug.setStatus(String.valueOf(TaskStatus.DONE));
    }

}