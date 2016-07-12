package org.synapsis.mail.fixture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.synapsis.mail.bean.Template;
import org.synapsis.mail.bean.MailProperty;
import org.synapsis.mail.dao.TemplateRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class TemplateDataFixture implements CommandLineRunner {

    @Autowired
    private TemplateRepository repository;

    @Override
    public void run(String... args) throws Exception {

        String code = "INVITATION_0012";
        String description = "Invitation mail template";
        String content = "Hi Mr {{FIRST_VALUE}}.<br>Your message has been successfully sent to {{SECOND_VALUE}}.";

        List<MailProperty> properties = new ArrayList<>();
        properties.add(new MailProperty("Invitation template first value", "FIRST_VALUE"));
        properties.add(new MailProperty("Invitation template second value", "SECOND_VALUE"));

        repository.save(new Template(code, content, description, properties));

        repository.findAll().forEach(System.out::println);
    }
}
