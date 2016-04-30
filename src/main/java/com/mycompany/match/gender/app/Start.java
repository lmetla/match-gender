package com.mycompany.match.gender.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author LOKESH
 */
public class Start {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here]
        int[] count = new int[3];
        // Load the data from files
        HashMap<String,String> NameSearchList = new HashMap<String,String>(FirstNamesListModel.getNames());
        HashMap<String,Person> persons = new HashMap<String,Person>(PersonModel.getPersonsData());
        // Algorithm implementation
        count = MatchFirstNamesAlgorithm.matchNames(NameSearchList, persons);
        // display results 
        System.out.println("Total Number of male names: " + count[0]);
        System.out.println("Total Number of female names: " + count[1]);
        System.out.println("Either male or female names: "+ count[2]);
        System.out.println("Percentage of male hits:" + (
                (count[0] * (100) / persons.size())));
        System.out.println("Percentage of female hits:" + (
                (count[1] * (100) / persons.size())));      
    }
    
}
