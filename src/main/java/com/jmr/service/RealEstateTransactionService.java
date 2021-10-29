package com.jmr.service;


import com.jmr.model.RealEstateTransaction;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Component
public interface RealEstateTransactionService {

    void save(MultipartFile file);
    List<RealEstateTransaction> getAllRealEstateTransactions();
}
