package org.synapsis.mail.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.mail.internet.InternetAddress;
import java.util.List;

/**
 * Created by Marvell on 07/07/2016.
 */
@Entity
public class Mail {
    @Id
    @GeneratedValue
    private long id;

    private String subject;

    private String content;

    private List<InternetAddress> to;

    private List<InternetAddress> from;

    private boolean sent;

    public Mail(String content, String subject, List<InternetAddress> to, List<InternetAddress> from) {
        this.content = content;
        this.subject = subject;
        this.to = to;
        this.from = from;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<InternetAddress> getTo() {
        return to;
    }

    public void setTo(List<InternetAddress> to) {
        this.to = to;
    }

    public List<InternetAddress> getFrom() {
        return from;
    }

    public void setFrom(List<InternetAddress> from) {
        this.from = from;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
