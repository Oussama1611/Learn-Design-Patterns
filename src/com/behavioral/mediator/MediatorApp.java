package com.behavioral.mediator;

public class MediatorApp {
    public static void main(String[] args) {
        ChatChannel chatChannel = new ChatChannel();

        Member Oussama = new Member("Oussama");
        Member Ayoub = new Member("Ayoub");
        Member Mohamed = new Member("Mohamed");

        chatChannel.addMember(Oussama);
        chatChannel.addMember(Ayoub);
        chatChannel.addMember(Mohamed);
        try {
            chatChannel.broadcast(Oussama, "Hello everyone!");
            chatChannel.broadcast(Ayoub, "Hey man whassup?");
            chatChannel.broadcast(Mohamed, "Fine man, how about you ?");
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
