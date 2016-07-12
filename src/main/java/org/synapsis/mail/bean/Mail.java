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

    protected Template template;

    private String subject;

    private List<InternetAddress> to;

    private List<InternetAddress> from;

    private boolean sent;

    public Mail(Template template, String subject, List<InternetAddress> to, List<InternetAddress> from) {
        this.template = template;
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

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
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
}
