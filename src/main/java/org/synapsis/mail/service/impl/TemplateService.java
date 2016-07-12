package org.synapsis.mail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.synapsis.mail.bean.Template;
import org.synapsis.mail.dao.TemplateRepository;
import org.synapsis.mail.service.ITemplateService;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by Marvell on 27/06/2016.
 */
@Component
public class TemplateService implements ITemplateService{

    @Autowired
    TemplateRepository templateRepository;

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Template get(Long id) {
        return templateRepository.findOne(id);
    }

    /**
     *
     * @return
     */
    @Override
    public Iterable<Template> getAll() {
        return templateRepository.findAll();
    }

    /**
     *
     * @param template
     */
    @Override
    public void create(Template template) {
        templateRepository.save(template);
    }

    /**
     *
     * @param id
     */
    @Override
    public void remove(Long id) {
        templateRepository.delete(id);
    }
}
