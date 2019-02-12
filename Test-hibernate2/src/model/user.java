/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ha Trung
 */
    @Entity
    @Table(name="user")
    public class user {
    @Id
    @GeneratedValue
    @Column(name="id")
    public int id;
    @Column(name="name")
    public String name;
    @Column(name="age")
    private int age;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private Set<phuongtien> listPt = new HashSet<>();

    public user(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public user() {
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Set<phuongtien> getListPt() {
        return listPt;
    }

    public void setListPt(Set<phuongtien> listPt) {
        this.listPt = listPt;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", name=" + name + '}';
    }
    
   
}
