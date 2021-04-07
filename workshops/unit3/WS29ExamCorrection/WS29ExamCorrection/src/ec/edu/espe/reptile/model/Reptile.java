/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.reptile.model;

/**
 *
 * @author martin lema
 */
public class Reptile {
    private int age;
    private String kind;
    private String colors;
    private String name ;
    private boolean condition;

    public Reptile(int age, String kind, String colors, String name, boolean condition) {
        this.age = age;
        this.kind = kind;
        this.colors = colors;
        this.name = name;
        this.condition = condition;
        
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param kind the kind to set
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * @return the colors
     */
    public String getColors() {
        return colors;
    }

    /**
     * @param colors the colors to set
     */
    public void setColors(String colors) {
        this.colors = colors;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the condition
     */
    public boolean isCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(boolean condition) {
        this.condition = condition;
    }
    
    
}
