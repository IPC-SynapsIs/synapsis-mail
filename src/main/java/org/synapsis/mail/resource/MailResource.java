package org.synapsis.mail.resource;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.synapsis.mail.bean.Mail;
import org.synapsis.mail.service.IMailService;

/**
 * Created by Marvell on 27/06/2016.
 */
@RestController
@RequestMapping("/mail")
@Api( value = "Mail",description = "Bean for resource 'Mail'")
public class MailResource {

    @Autowired
    IMailService mailService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    @ApiOperation(value = "Send a mail")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Mail created", response = Mail.class),
            @ApiResponse(code = 404, message = "Mail not sent", response = void.class)})
    public Mail sendMail(@ApiParam(value = "Mail Object", required = true) @RequestBody Mail mail) {
        mailService.send(mail);
        return mail;
    }
}
