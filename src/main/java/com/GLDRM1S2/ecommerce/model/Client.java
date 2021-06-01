/**
 * created by hatem ghozzi
 */
package com.GLDRM1S2.ecommerce.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "client")
public class Client  extends  Internaute{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "nomeclient", nullable = true)
    private String nomeclient;

    @Column(name = "prenomclient", nullable = true)
    private String prenomclient;

    @Column(name = "comptclient", nullable = true)
    private String comptclient;

    @Column(name = "tel", nullable = true)
    private String tel;
 @Column(name = "email", nullable = true)
    private String email;
 @Column(name = "adresslivraison", nullable = true)
    private String adresslivraison;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeclient() {
        return nomeclient;
    }

    public void setNomeclient(String nomeclient) {
        this.nomeclient = nomeclient;
    }

    public String getPrenomclient() {
        return prenomclient;
    }

    public void setPrenomclient(String prenomclient) {
        this.prenomclient = prenomclient;
    }

    public String getComptclient() {
        return comptclient;
    }

    public void setComptclient(String comptclient) {
        this.comptclient = comptclient;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresslivraison() {
        return adresslivraison;
    }

    public void setAdresslivraison(String adresslivraison) {
        this.adresslivraison = adresslivraison;
    }
}
