/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zooparks.controller;
import ec.edu.espe.zooparks.model.Zoo;
import utils.FileManager;

/**
 *
 * @author braya
 */
public class ZooController {
    
     public void save(Zoo zoo){
       
        String data = (zoo.getZooName() + ", " + zoo.getLocationArea() + ", "
                + zoo.getMostIconicAnimal() + ", " + zoo.getNumberOfHectares() + ", "
                + zoo.getEntryPrice());
    
        FileManager.save(data,"Zoo Parks");
    }
    
    public String read(){
        String data;
        data = FileManager.read("Zoo Parks");
        return data;
    }
    
}

