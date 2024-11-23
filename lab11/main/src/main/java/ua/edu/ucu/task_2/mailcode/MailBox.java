package ua.edu.ucu.task_2.mailcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ua.edu.ucu.task_2.MailInfo;

public class MailBox {
    private final List<MailInfo> infos = Collections.synchronizedList(new ArrayList<>());
    private final MailSender mailSender = new MailSender();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void removeMailInfo(MailInfo mailInfo) {
        infos.remove(mailInfo);
    }

    public void sendAll() {
        synchronized (infos) {
            for (MailInfo mailInfo : infos) {
                try {
                    mailSender.sendMail(mailInfo);
                } catch (Exception e) {
                    System.err.println("Error sending mail to " + mailInfo.getClient().getName() + ": " + e.getMessage());
                }
            }
            infos.clear();
        }
    }
}
