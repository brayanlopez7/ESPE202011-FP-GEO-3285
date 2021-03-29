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
public class Sorting1 {

    public String[] sortByBubbleSort(String[] songs) {
        int n = songs.length;
        String temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (songs[j].compareTo(songs[j + 1]) > 0) {

                    //swap
                    temp = songs[j];
                    songs[j] = songs[j + 1];
                    songs[j + 1] = temp;
                }
            }
        }
        return songs;
    }

}
