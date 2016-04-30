package com.mycompany.match.gender.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static com.mycompany.match.gender.app.READCSV.readCsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author LOKESH
 */
public class PersonModel {
     private static final HashMap<String,Person> persons = new HashMap<String,Person>();

    static HashMap<String,Person> getPersonsData() throws IOException {
        InputStream in = Thread.currentThread().getClass().getResourceAsStream("/data/name_email_sample.csv"); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Iterable<CSVRecord> records=readCsv(reader);
        for (CSVRecord record : records) {
            Person person;
            if(record.getRecordNumber() != 1) {
                if (record.size() > 1) {
                    person = new Person(record);
                    persons.put(record.get(9), person);
                }
            }

        }
        return persons;
    }
    
}
