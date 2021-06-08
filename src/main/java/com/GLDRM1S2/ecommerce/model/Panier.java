package com.GLDRM1S2.ecommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Panier")
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "quantite", nullable = true)
    private Integer quantite;


    @OneToMany()
    private List<Produit> produit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
}
