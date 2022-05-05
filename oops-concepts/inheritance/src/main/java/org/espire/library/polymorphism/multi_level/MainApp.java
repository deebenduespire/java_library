package org.espire.library.polymorphism.multi_level;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Welcome to WhatsApp");
        WhatsAppVersion3 whatsAppVersion3 = new WhatsAppVersion3();
        whatsAppVersion3.chat();
        whatsAppVersion3.voiceCalling();
        whatsAppVersion3.videoCallingFeature();
    }
}
