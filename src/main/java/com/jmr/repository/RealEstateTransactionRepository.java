package com.jmr.repository;

import com.jmr.model.RealEstateTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealEstateTransactionRepository extends JpaRepository<RealEstateTransaction, String> {
}
