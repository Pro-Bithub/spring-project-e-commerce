package com.GLDRM1S2.ecommerce.controller;

import com.GLDRM1S2.ecommerce.model.Command;
import com.GLDRM1S2.ecommerce.model.Feedback;
import com.GLDRM1S2.ecommerce.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;
@RestController
@RequestMapping("/api/v1/Feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping(value = "GET_ALL", method = RequestMethod.GET)
    public List<Feedback> getAll() {

        return (feedbackService.getAll());
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public int delete(@PathVariable Long id) {
        return feedbackService.delete(id);
    }

    @RequestMapping(value = "SAVE", method = RequestMethod.PUT)
    public Feedback save(@RequestBody Feedback feedback) throws ValidationException, RuntimeException {

        return feedbackService.save(feedback);
    }
}
