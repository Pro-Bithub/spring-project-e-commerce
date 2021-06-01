/**
 * created by hatem ghozzi on 07 août 2020
 */
package com.GLDRM1S2.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "recommandation")
public class Recommandatione  extends Internaute{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idfk;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "CET")
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date = new Date();


    @Column(name = "description", nullable = true)
    private String description;

    public Long getIdfk() {
        return idfk;
    }

    public void setIdfk(Long idfk) {
        this.idfk = idfk;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
