/**
 * created by hatem ghozzi 
 */
package com.GLDRM1S2.ecommerce.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "statuschang")
public class Statuschang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
