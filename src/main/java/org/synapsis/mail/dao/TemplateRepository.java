package org.synapsis.mail.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.synapsis.mail.bean.Template;

import java.util.Collection;
import java.util.UUID;

@RepositoryRestResource
public interface TemplateRepository extends JpaRepository<Template, Long> {


}
