/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.Serializable;

/**
 *
 * @author Ha Trung
 */
public class user implements Serializable{
    private String name;
    private int tuoi;

    public user(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    public user() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
}
