/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortingrockhits.controller;

/**
 *
 * @author braya
 */
public class Searcher1 {

    public static int findSongs(String[] elements, String x) {
        int i;
        int n = elements.length;
        for (i = 0; i < n; i++) {

            if (elements[i].equals(x)) {
               return i; 
            }
        }
        return -1;
     
        
    }

}
