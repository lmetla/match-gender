package com.mycompany.match.gender.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author LOKESH
 */
public class READCSV {
    static Iterable<CSVRecord> readCsv(Reader in) throws IOException {
        return CSVFormat.EXCEL.parse(in);    
    }
    
}
