package org.synapsis.mail.service;

import org.springframework.stereotype.Component;
import org.synapsis.mail.bean.Template;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by Marvell on 27/06/2016.
 */
@Component
public interface ITemplateService {

    /**
     *
     * @param id
     * @return
     */
    Template get(Long id);

    /**
     *
     * @return
     */
    Iterable<Template> getAll();

    /**
     *
     * @param template
     */
    void create(Template template);

    /**
     *
     * @param id
     */
    void remove(Long id);
}
