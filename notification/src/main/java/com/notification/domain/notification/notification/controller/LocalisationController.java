package com.notification.domain.notification.notification.controller;

import com.notification.domain.notification.notification.entities.Localisation;
import com.notification.domain.notification.notification.service.LocalisationService;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("localisation")
@RestController
public class LocalisationController {
    private final LocalisationService localisationService ;
    @GetMapping
    public List<Localisation> findAll(){
        return this.localisationService.findAll();
    }
    @PostMapping()
    public Localisation create(@RequestBody Localisation localisation){
        return this.localisationService.create(localisation);
    }
    @GetMapping("/csv")
    public void exportCSV(HttpServletResponse response) throws Exception{
//set file name and content type
        String filename = "localisation.csv";
//https://attacomsian.com/blog/export-download-data-csv-file-spring-boot
        response.setContentType("text/csv");
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + filename + "\"");

        //create a csv writer
        StatefulBeanToCsv<Localisation> writer = new StatefulBeanToCsvBuilder<Localisation>(response.getWriter())
                .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .withOrderedResults(false)
                .build();

        //write all users to csv file
        writer.write(localisationService.findAll());
    }

    @GetMapping("/delete")
    public void delete(){
        localisationService.deleteAll();
    }
}

