package com.ebay.api.repository;

import com.ebay.api.domain.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<Bid, String> {
}
