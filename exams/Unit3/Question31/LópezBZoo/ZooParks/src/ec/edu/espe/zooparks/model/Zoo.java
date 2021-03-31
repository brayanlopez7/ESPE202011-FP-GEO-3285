/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zooparks.model;

/**
 *
 * @author braya
 */
public class Zoo {

    private String zooName;
    private String locationArea;
    private String mostIconicAnimal;
    private int numberOfHectares;
    private String entryPrice;
    
     public Zoo(String zooName, String locationArea, String mostIconicAnimals, int numberOfHectares, String entryPrice) {
        this.zooName = zooName;
        this.locationArea = locationArea;
        this.mostIconicAnimal = mostIconicAnimals;
        this.numberOfHectares = numberOfHectares;
        this.entryPrice = entryPrice;
     }
    /**
     * @return the zooName
     */
    public String getZooName() {
        return zooName;
    }

    /**
     * @param zooName the zooName to set
     */
    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    /**
     * @return the locationArea
     */
    public String getLocationArea() {
        return locationArea;
    }

    /**
     * @param locationArea the locationArea to set
     */
    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    /**
     * @return the mostIconicAnimal
     */
    public String getMostIconicAnimal() {
        return mostIconicAnimal;
    }

    /**
     * @param mostIconicAnimal the mostIconicAnimal to set
     */
    public void setMostIconicAnimal(String mostIconicAnimal) {
        this.mostIconicAnimal = mostIconicAnimal;
    }

    /**
     * @return the numberOfHectares
     */
    public int getNumberOfHectares() {
        return numberOfHectares;
    }

    /**
     * @param numberOfHectares the numberOfHectares to set
     */
    public void setNumberOfHectares(int numberOfHectares) {
        this.numberOfHectares = numberOfHectares;
    }

    /**
     * @return the entryPrice
     */
    public String getEntryPrice() {
        return entryPrice;
    }

    /**
     * @param entryPrice the entryPrice to set
     */
    public void setEntryPrice(String entryPrice) {
        this.entryPrice = entryPrice;
    }
    
    
    
}
