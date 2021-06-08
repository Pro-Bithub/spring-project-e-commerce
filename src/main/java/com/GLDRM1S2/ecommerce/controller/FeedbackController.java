package com.GLDRM1S2.ecommerce.controller;

import com.GLDRM1S2.ecommerce.model.Command;
import com.GLDRM1S2.ecommerce.model.Feedback;
import com.GLDRM1S2.ecommerce.service.FeedbackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;
@RestController
@RequestMapping("/api/v1/Feedback")
@Api(value = "This is a Feedback API", description = "This is a Feedback API")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping(value = "GET_ALL", method = RequestMethod.GET)
    @ApiOperation(value = "List of Panier")
    public List<Feedback> getAll() {

        return (feedbackService.getAll());
    }



    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "get  by  id")
    public Feedback getbyid(@PathVariable Long id) {
        return feedbackService.getbyid(id);
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ApiOperation(value = "delete  by  id")
    public int delete(@PathVariable Long id) {
        return feedbackService.delete(id);
    }

    @RequestMapping(value = "SAVE", method = RequestMethod.PUT)
    @ApiOperation(value = "save  Feedback")
    public Feedback save(@RequestBody Feedback feedback) throws ValidationException, RuntimeException {

        return feedbackService.save(feedback);
    }
}
