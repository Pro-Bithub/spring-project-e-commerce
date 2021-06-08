/**
 * created by hatem ghozzi 
 */
package com.GLDRM1S2.ecommerce.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "command")
public class Command {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "CET")
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "datecommande")
    private Date datecommande = new Date();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatecommande() {
        return datecommande;
    }

    public void setDatecommande(Date datecommande) {
        this.datecommande = datecommande;
    }


}
