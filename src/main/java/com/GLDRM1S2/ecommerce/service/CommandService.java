package com.GLDRM1S2.ecommerce.service;

import com.GLDRM1S2.ecommerce.model.Command;
import com.GLDRM1S2.ecommerce.repository.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandService {
    @Autowired
    private CommandRepository commandeRepository;

    public Command save(Command commande) {
        return commandeRepository.save(commande);
    }
    public List<Command> getAll( ) {
        return commandeRepository.findAll();
    }
    public Integer delete(Long id) {

        commandeRepository.deleteById(id);
        return null;
    }

    public Command getbyid(Long id) {
        return commandeRepository.getById(id);
    }
}
