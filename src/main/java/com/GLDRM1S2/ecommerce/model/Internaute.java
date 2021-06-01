/**
 * created by hatem ghozzi on 07 août 2020
 */
package com.GLDRM1S2.ecommerce.model;


import javax.persistence.*;


@Entity
@Table(name = "internaute")
public class Internaute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "nominternaute", nullable = true)
    private String nominternaute;

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
}
