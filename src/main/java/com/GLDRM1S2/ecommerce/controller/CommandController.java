package com.GLDRM1S2.ecommerce.controller;

import com.GLDRM1S2.ecommerce.model.Command;
import com.GLDRM1S2.ecommerce.service.CommandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Command")
@Api(value = "This is a Products API", description = "This is a Commande API")
public class CommandController {
    @Autowired
    private CommandService commandService;

    @RequestMapping(value = "GET_ALL", method = RequestMethod.GET)
    @ApiOperation(value = "List of Command")
    public List<Command> getAll() {

        return (commandService.getAll());
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "delete  by  id")
    public Integer delete(@PathVariable Long id) {
        return commandService.delete(id);
    }


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "get  by  id")
    public Command getbyid(@PathVariable Long id) {
        return commandService.getbyid(id);
    }


    @RequestMapping(value = "SAVE", method = RequestMethod.PUT)
    @ApiOperation(value = "save  Command")
    public Command save(@RequestBody Command command) throws ValidationException, RuntimeException {
        //  return articlesFournisseur;
        return commandService.save(command);
    }
}
