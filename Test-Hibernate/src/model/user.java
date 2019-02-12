/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ha Trung
 */
@Entity
@Table(name="user")
public class user implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="id")
    public int id;
    @Column(name="name")
    public String name;
    @Column(name="age")
    private int age;
//    @OneToMany(mappedBy = "user",mappedBy = "user")
//    public Collection<phuongtien> pt;

//public Collection<phuongtien> getPt() {
//	return pt;
//}
//
//public void setPt(Collection<phuongtien> pt) {
//	this.pt = pt;
//}
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

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
