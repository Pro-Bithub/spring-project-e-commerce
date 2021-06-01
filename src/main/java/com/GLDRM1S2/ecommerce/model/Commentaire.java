package com.GLDRM1S2.ecommerce.model;

import javax.persistence.*;
import java.util.List;

/**
 * created by hatem ghozzi 
 */


@Entity
@Table(name = "commentaire")
public class Commentaire extends Internaute{
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "nominternaute", nullable = true)
    private String nominternaute;


    @ManyToOne()
    private Internaute internaute;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNominternaute() {
        return nominternaute;
    }

    public void setNominternaute(String nominternaute) {
        this.nominternaute = nominternaute;
    }

    public Internaute getInternaute() {
        return internaute;
    }

    public void setInternaute(Internaute internaute) {
        this.internaute = internaute;
    }
}
