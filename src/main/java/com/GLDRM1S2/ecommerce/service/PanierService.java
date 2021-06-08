package com.GLDRM1S2.ecommerce.service;

import com.GLDRM1S2.ecommerce.model.Command;
import com.GLDRM1S2.ecommerce.model.Panier;
import com.GLDRM1S2.ecommerce.repository.FeedbackRepository;
import com.GLDRM1S2.ecommerce.repository.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanierService {

    @Autowired
    private PanierRepository panierRepository;
    public Panier save(Panier panier) {
        return panierRepository.save(panier);
    }
    public List<Panier> getAll( ) {
        return panierRepository.findAll();
    }
    public Integer delete(Long id) {
        panierRepository.deleteById(id);
        return null;
    }


    public Panier getbyid(Long id) {
        return panierRepository.getById(id);
    }
}
