/**
 * created by hatem ghozzi 
 */
package com.GLDRM1S2.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "traiter")
public class Traiter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "CET")
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date = new Date();

    @Column(name = "typeaction")
    private String typeaction;
    @ManyToOne()
    private Admin admin;

    @ManyToOne()
    private Command command;
     @ManyToOne()
    private Statuschang statuschang;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTypeaction() {
        return typeaction;
    }

    public void setTypeaction(String typeaction) {
        this.typeaction = typeaction;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Statuschang getStatuschang() {
        return statuschang;
    }

    public void setStatuschang(Statuschang statuschang) {
        this.statuschang = statuschang;
    }
}
