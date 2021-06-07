package com.GLDRM1S2.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * created by hatem ghozzi 
 */
@Entity
@Table(name = "feedback")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "type_feedback", nullable = true)
    private String type;
    @Column(name = "descrip_feedback", nullable = true)
    private String description;
    @ManyToOne()
    private Client client;
    @ManyToOne()
    private Produit produit;


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", client=" + client +
                ", produit=" + produit +
                '}';
    }
}
