package ua.edu.ucu.task_2.mailcode;

import ua.edu.ucu.task_2.Client;

public class GiftMail implements MailCode {
    @Override
    public String generateContent(Client client) {
        return "Dear " + client.getName() + ", we have a special gift for you! Check out our latest offers.";
    }
}
