package com.GLDRM1S2.ecommerce.repository;

import com.GLDRM1S2.ecommerce.model.Feedback;
import com.GLDRM1S2.ecommerce.model.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanierRepository extends JpaRepository<Panier, Long> {
}
