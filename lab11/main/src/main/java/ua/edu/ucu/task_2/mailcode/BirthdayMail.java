package ua.edu.ucu.task_2.mailcode;

import ua.edu.ucu.task_2.Client;

public class BirthdayMail implements MailCode {
    @Override
    public String generateContent(Client client) {
        return "Happy Birthday, " + client.getName() + "! Wishing you all the best on your special day!";
    }
}

