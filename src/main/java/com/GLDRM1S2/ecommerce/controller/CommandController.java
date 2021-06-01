package com.GLDRM1S2.ecommerce.controller;

import com.GLDRM1S2.ecommerce.model.Command;
import com.GLDRM1S2.ecommerce.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Command")
public class CommandController {
    @Autowired
    private CommandService commandService;

    @RequestMapping(value = "GET_ALL", method = RequestMethod.GET)
    public List<Command> getAll() {

        return (commandService.getAll());
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Integer delete(@PathVariable Long id) {
        return commandService.delete(id);
    }

    @RequestMapping(value = "SAVE", method = RequestMethod.PUT)
    public Command save(@RequestBody Command command) throws ValidationException, RuntimeException {
        //  return articlesFournisseur;
        return commandService.save(command);
    }
}
