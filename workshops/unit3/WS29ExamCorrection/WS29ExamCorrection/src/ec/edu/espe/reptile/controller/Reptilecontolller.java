/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.reptile.controller;
import Utils.FileManager;
import ec.edu.espe.reptile.model.Reptile;

/**
 *
 * @author martin lema
 */
public class Reptilecontolller {
    public void save(Reptile reptile){
    String data=reptile.getAge() +"," + reptile.getKind()+ ","+ reptile.getColors()+" ,"+reptile.getColors()+","+ reptile.isCondition();
FileManager.save(data,"Furnitures");
    }
     public String read(){
        String data;
        data =FileManager.read("Reptiles");
        return data;
    }
    } 

