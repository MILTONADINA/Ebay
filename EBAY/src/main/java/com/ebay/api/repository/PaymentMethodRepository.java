package com.ebay.api.repository;

import com.ebay.api.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, String> {
}
