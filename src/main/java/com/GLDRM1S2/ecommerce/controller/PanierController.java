package com.GLDRM1S2.ecommerce.controller;

import com.GLDRM1S2.ecommerce.model.Feedback;
import com.GLDRM1S2.ecommerce.model.Panier;
import com.GLDRM1S2.ecommerce.service.PanierService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Panier")
@Api(value = "This is a Panier API", description = "This is a Panier API")
public class PanierController {
    @Autowired
    private PanierService panierService;

    @ApiOperation(value = "List of Panier")
    @RequestMapping(value = "GET_ALL", method = RequestMethod.GET)
    public List<Panier> getAll() {

        return (panierService.getAll());
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "get  by  id")
    public Panier getbyid(@PathVariable Long id) {
        return panierService.getbyid(id);
    }




    @ApiOperation(value = "delete  by  id")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Integer delete(@PathVariable Long id) {
        return panierService.delete(id);
    }

    @ApiOperation(value = "save  panier")
    @RequestMapping(value = "SAVE", method = RequestMethod.PUT)
    public Panier save(@RequestBody Panier panier) throws ValidationException, RuntimeException {
        //  return articlesFournisseur;
        return panierService.save(panier);
    }
}
