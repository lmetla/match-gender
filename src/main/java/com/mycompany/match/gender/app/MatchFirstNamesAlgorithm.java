package com.mycompany.match.gender.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;

/**
 *
 * @author LOKESH
 */
public class MatchFirstNamesAlgorithm {
    static int[] matchNames(HashMap<String,String> nameSearches, HashMap<String,Person> persons) {
        int[] count = new int[]{0,0,0};
        for (String key: persons.keySet()) {
            Person person = persons.get(key);
            if(nameSearches.containsKey(person.getFirstName())) {
                if(nameSearches.get(person.getFirstName()).equals("male")) {
                    count[0]++;
                }
                else if(nameSearches.get(person.getFirstName()).equals("female")) {
                    count[1]++;
                }
                else {
                    count[2]++;
                }

            }
        }
        return count;
    }
    
}
