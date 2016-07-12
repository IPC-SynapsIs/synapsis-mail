package org.synapsis.mail.resource;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.synapsis.mail.bean.Template;
import org.synapsis.mail.service.ITemplateService;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by Marvell on 27/06/2016.
 */
@RestController
@RequestMapping("/template")
@Api( value = "Template",description = "Bean for resource 'Template'")
public class TemplateResource {

    @Autowired
    ITemplateService templateService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiOperation(value = "Send a template")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Template created", response = Template.class),
            @ApiResponse(code = 404, message = "Template not created", response = void.class)})
    public Template sendTemplate(@ApiParam(value = "Template Object", required = true) @RequestBody Template template) {
        templateService.create(template);
        return template;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiOperation(value = "Get a template by his Id")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "The template is found", response = Template.class),
            @ApiResponse(code = 404, message = "Template not found", response = void.class)})
    public Template get(@ApiParam(value = "Template Id", required = true) @PathVariable("id") Long id) {
        return templateService.get(id);
    }
}
