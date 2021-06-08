package com.GLDRM1S2.ecommerce.service;

import com.GLDRM1S2.ecommerce.model.Client;
import com.GLDRM1S2.ecommerce.model.Command;
import com.GLDRM1S2.ecommerce.model.Feedback;
import com.GLDRM1S2.ecommerce.model.Produit;
import com.GLDRM1S2.ecommerce.repository.CommandRepository;
import com.GLDRM1S2.ecommerce.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;
    @Autowired
    RestTemplate restTemplate;
    public Feedback save(Feedback feedback) {

        if(feedback.getClient()==null &&feedback.getProduit()==null ){
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity <String> entity = new HttpEntity<String>(headers);
            try{
                ResponseEntity<Client> responseEntity = restTemplate.exchange("http://localhost:8081/api/products/1", HttpMethod.GET,  null,
                        new ParameterizedTypeReference<Client>(){});
                ResponseEntity<Produit> responseEntity2 = restTemplate.exchange("http://localhost:8081/api/client/1", HttpMethod.GET,  null,
                        new ParameterizedTypeReference<Produit>(){});

                Client client = responseEntity.getBody();
                Produit produit = responseEntity2.getBody();
                feedback.setClient(client);
                feedback.setProduit(produit);

            } catch (Exception e) {
                // TODO: handle exception
                System.err.println(e);
            }
         //   System.out.println("res = [" + res + "]");
        }
        return feedbackRepository.save(feedback);
    }
    public List<Feedback> getAll( ) {
        return feedbackRepository.findAll();
    }
    public Integer delete(Long id) {

        feedbackRepository.deleteById(id);
        return null;
    }

    public Feedback getbyid(Long id) {
        return feedbackRepository.getById(id);
    }
}
