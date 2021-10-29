package com.jmr.service;

import com.jmr.helper.CSVHelper;
import com.jmr.model.RealEstateTransaction;
import com.jmr.repository.RealEstateTransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class RealEstateTransactionServiceBean implements RealEstateTransactionService {

  private final RealEstateTransactionRepository repository;

  public RealEstateTransactionServiceBean(RealEstateTransactionRepository repository) {
    this.repository = repository;
  }

  public void save(MultipartFile file) {
    try {
      List<RealEstateTransaction> realEstateTransactions = CSVHelper.csvToRealEstate(file.getInputStream());
      repository.saveAll(realEstateTransactions);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public List<RealEstateTransaction> getAllRealEstateTransactions() {
    return repository.findAll();
  }
}
