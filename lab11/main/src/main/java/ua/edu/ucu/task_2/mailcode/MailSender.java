package ua.edu.ucu.task_2.mailcode;

import ua.edu.ucu.task_2.MailInfo;


public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        String content = mailInfo.getMailCode().generateContent(mailInfo.getClient());
        System.out.println("Sending mail to " + mailInfo.getClient().getName() + ": " + content);
    }
}
