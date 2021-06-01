package com.GLDRM1S2.ecommerce.service;

import com.GLDRM1S2.ecommerce.model.Command;
import com.GLDRM1S2.ecommerce.model.Feedback;
import com.GLDRM1S2.ecommerce.repository.CommandRepository;
import com.GLDRM1S2.ecommerce.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback save(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
    public List<Feedback> getAll( ) {
        return feedbackRepository.findAll();
    }
    public Integer delete(Long id) {

        feedbackRepository.deleteById(id);
        return null;
    }
}
