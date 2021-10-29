package com.jmr.helper;

import com.jmr.model.RealEstateTransaction;
import org.apache.commons.csv.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVHelper {

  public static String TYPE = "text/csv";

  public static boolean hasCSVFormat(MultipartFile file) {

    if (!TYPE.equals(file.getContentType())) {
      return false;
    }

    return true;
  }

  public static List<RealEstateTransaction> csvToRealEstate(InputStream is) {
    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        CSVParser csvParser = new CSVParser(fileReader,
            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

      List<RealEstateTransaction> tutorials = new ArrayList<RealEstateTransaction>();

      Iterable<CSVRecord> csvRecords = csvParser.getRecords();

      for (CSVRecord csvRecord : csvRecords) {
        RealEstateTransaction tutorial = new RealEstateTransaction(
              csvRecord.get("Street"),
              csvRecord.get("City"),
              csvRecord.get("Zip"),
              csvRecord.get("State"),
              csvRecord.get("Beds"),
              csvRecord.get("Baths"),
              csvRecord.get("Sq__ft"),
              csvRecord.get("Type"),
              csvRecord.get("Sale_Date"),
              csvRecord.get("Price"),
              csvRecord.get("Latitude"),
              csvRecord.get("Longitude")
            );

        tutorials.add(tutorial);
      }

      return tutorials;
    } catch (IOException e) {
      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
    }
  }


}
