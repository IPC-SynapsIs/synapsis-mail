package org.synapsis.mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.synapsis.mail.bean.Mail;
import org.synapsis.mail.dao.IMailRepository;
import org.synapsis.mail.service.IMailService;

/**
 * Created by Marvell on 27/06/2016.
 */
@Component
public class MailService implements IMailService {

    @Autowired
    IMailRepository mailRepository;
    /**
     *
     * @param mail
     */
    @Override
    public void send(Mail mail) {

    }
}
