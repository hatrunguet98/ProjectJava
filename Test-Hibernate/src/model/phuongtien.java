/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ha Trung
 */
@Entity
@Table(name="phuongtien")
public class phuongtien implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="MaPt")
    private int mapt;
    @Column(name="name")
    private String name;
    @Column(name="userid")
    private int userid;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user")
//    private user user;

    public int getMapt() {
        return mapt;
    }

    public void setMapt(int mapt) {
        this.mapt = mapt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "phuongtien{" + "mapt=" + mapt + ", name=" + name + '}';
    }

    
}
