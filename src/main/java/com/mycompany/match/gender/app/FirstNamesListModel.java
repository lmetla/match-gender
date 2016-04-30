package com.mycompany.match.gender.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static com.mycompany.match.gender.app.READCSV.readCsv;
import java.io.BufferedReader;
import java.io.File;
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
public class FirstNamesListModel {
    private static final HashMap<String,String> GenderNamesList = new HashMap<String,String>();

    static HashMap<String, String> getNames() throws IOException {
        InputStream in = Thread.currentThread().getClass().getResourceAsStream("/data/malenames.txt"); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Iterable<CSVRecord> records=readCsv(reader);
        for (CSVRecord record : records) {
            if(record.getRecordNumber() >= 0) {
                // Here true represents male
                String key = record.get(0).toLowerCase();
                GenderNamesList.put(key,"male");
            }
        }
        in = Thread.currentThread().getClass().getResourceAsStream("/data/femalenames.txt");
        reader = new BufferedReader(new InputStreamReader(in));
        records=readCsv(reader);
        for (CSVRecord record : records) {
            if(record.getRecordNumber() >= 0) {
                // Here false represents female
                String key = record.get(0).toLowerCase();
                if(!GenderNamesList.containsKey(key)) {
                    GenderNamesList.put(key,"female");
                }
                else {
                    GenderNamesList.put(key,"either");
                }
            }
        }
        return GenderNamesList;
    }
    
}
