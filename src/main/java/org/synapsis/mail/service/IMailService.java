package org.synapsis.mail.service;

import org.springframework.stereotype.Component;
import org.synapsis.mail.bean.Mail;

/**
 * Created by Marvell on 27/06/2016.
 */
@Component
public interface IMailService {

    /**
     *
     * @param mail
     */
    void send(Mail mail);
}
