package org.synapsis.mail.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Marvell on 07/07/2016.
 */
@Entity
public class Template {

    @Id
    @GeneratedValue
    private long id;

    private String description;

    private String code;

    private String content;

    private List<MailProperty> properties;

    public Template(String code) {
        this.code = code;
    }

    public Template(String code, String content, String description, List<MailProperty> properties) {
        this.code = code;
        this.content = content;
        this.description = description;
        this.properties = properties;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<MailProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<MailProperty> properties) {
        this.properties = properties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
