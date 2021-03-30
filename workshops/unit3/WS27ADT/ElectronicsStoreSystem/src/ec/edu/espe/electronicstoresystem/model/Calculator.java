/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.electronicstoresystem.model;
import java.io.BufferedReader;
/**
 *
 * @author braya
 */
public class Calculator {

    private String model;
    private String color;
    private float serialNumber;
    private String operations;
    private String Size;

    public Calculator(String model, String color, float serialNumber, String operations, String Size) {
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.operations = operations;
        this.Size = Size;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numbers
     */
    public double getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the numbers to set
     */
    public void setNumbers(float serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the operations
     */
    public String getOperations() {
        return operations;
    }

    /**
     * @param leters the operations to set
     */
    public void setOperations(String operations) {
        this.operations = operations;
    }

    /**
     * @return the Size
     */
    public String getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

}
