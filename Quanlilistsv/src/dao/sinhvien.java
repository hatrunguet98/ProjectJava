/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Ha Trung
 */
@Entity
@Table(name="sinhvien")
public class sinhvien {
    @Id
    @GeneratedValue
    @Column(name="id")
    private  int id;
    @Column(name="msv")
    private int msv;
    @Column(name="name")
    private  String name;
    @Column(name="age")
    private int age;
    @ManyToMany(mappedBy = "sv")
    private List<lophoc> lh = new ArrayList<lophoc>();
    public sinhvien() {
    }
    public sinhvien(int id, int msv, String name, int age) {
        this.id = id;
        this.msv = msv;
        this.name = name;
        this.age = age;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "sinhvien{" + "id=" + id + ", msv=" + msv + ", name=" + name + ", age=" + age + '}';
    }  

    public List<lophoc> getLh() {
        return lh;
    }

    public void setLh(List<lophoc> lh) {
        this.lh = lh;
    }
    
}
