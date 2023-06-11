package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String type="whatsApp";
        if(type.equalsIgnoreCase("whatsapp")){
            WhatsAppNotification whatsAppNotification=new WhatsAppNotification("7078667617","whatsapp","yes");
            WhatsAppNotificationHandler whatsAppNotificationHandler = new WhatsAppNotificationHandler();
            whatsAppNotificationHandler.sendNotification(whatsAppNotification);
        }

        }
}