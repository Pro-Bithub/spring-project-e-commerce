/**
 * created by hatem ghozzi on 13 août 2020
 */
package com.GLDRM1S2.ecommerce.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "quantite")
public class Quantite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


  
   @OneToMany(cascade = CascadeType.ALL)
    private List<Command> command;
   @ManyToOne()
    private Internaute internaute;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Command> getCommand() {
        return command;
    }

    public void setCommand(List<Command> command) {
        this.command = command;
    }

    public Internaute getInternaute() {
        return internaute;
    }

    public void setInternaute(Internaute internaute) {
        this.internaute = internaute;
    }
}
