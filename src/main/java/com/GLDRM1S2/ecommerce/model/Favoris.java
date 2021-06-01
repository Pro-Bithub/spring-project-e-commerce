/**
 * created by hatem ghozzi
 */
package com.GLDRM1S2.ecommerce.model;



import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "favoris")
public class Favoris {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   @OneToMany(cascade = CascadeType.ALL)
    private List<Produit> produit;
  
   @OneToMany(cascade = CascadeType.ALL)
    private List<Client> Client;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }

    public List<com.GLDRM1S2.ecommerce.model.Client> getClient() {
        return Client;
    }

    public void setClient(List<com.GLDRM1S2.ecommerce.model.Client> client) {
        Client = client;
    }
}
