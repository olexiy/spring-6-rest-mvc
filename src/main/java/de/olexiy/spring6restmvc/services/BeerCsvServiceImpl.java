package de.olexiy.spring6restmvc.services;

import com.opencsv.bean.CsvToBeanBuilder;
import de.olexiy.spring6restmvc.model.BeerCSVRecord;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@Service
public class BeerCsvServiceImpl implements BeerCsvService {
    @Override
    public List<BeerCSVRecord> convertCSV(File csvFile) {
        List<BeerCSVRecord> records;
        try {
            records = new CsvToBeanBuilder<BeerCSVRecord>(new FileReader(csvFile))
                    .withType(BeerCSVRecord.class)
                    .build()
                    .parse();
            return records;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
