/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.electronicstoresystem.controller;

import ec.edu.espe.electronicstoresystem.model.Calculator;
import utils.FileManager;

/**
 *
 * @author braya
 */
public class CalculatorController {
    
    public void save(Calculator calculator){
       
        String data = (calculator.getModel() + ", " + calculator.getColor() + ", "
                + calculator.getSerialNumber() + ", " + calculator.getOperations() + ", "
                + calculator.getSize());
    
        FileManager.save(data,"Calculators");
    }
    
    public String read(){
        String data;
        data = FileManager.read("calculators");
        return data;
    }
    
}
