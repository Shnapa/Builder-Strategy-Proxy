package ua.edu.ucu.task_2;

import java.time.LocalDate;

import ua.edu.ucu.task_2.mailcode.BirthdayMail;
import ua.edu.ucu.task_2.mailcode.GiftMail;
import ua.edu.ucu.task_2.mailcode.MailBox;
import ua.edu.ucu.task_2.mailcode.MailCode;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alice", LocalDate.of(1992, 5, 14), "Female");
        Client client2 = new Client("Bob", LocalDate.of(1997, 8, 20), "Male");

        MailCode birthdayMail = new BirthdayMail();
        MailCode giftMail = new GiftMail();

        MailInfo mailInfo1 = new MailInfo(client1, birthdayMail);
        MailInfo mailInfo2 = new MailInfo(client2, giftMail);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);
        mailBox.sendAll();
    }
}

