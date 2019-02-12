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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Ha Trung
 */
@Entity
@Table(name="lophoc")
public class lophoc {
    @Id
    @GeneratedValue
    @Column(name="id")
    private  int id;
    @Column(name="mlh")
    private int mlh;
    @Column(name="name")
    private  String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "lophoc_sinhvien",
    joinColumns = @JoinColumn(name = "mlh"),
    inverseJoinColumns = @JoinColumn(name = "msv")
    )
    private List<sinhvien> sv = new ArrayList<sinhvien>();
    public lophoc() {
    }
    public lophoc(int id, int mlh, String name) {
        this.id = id;
        this.mlh = mlh;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMlh() {
        return mlh;
    }

    public void setMlh(int mlh) {
        this.mlh = mlh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<sinhvien> getSv() {
        return sv;
    }

    public void setSv(ArrayList<sinhvien> sv) {
        this.sv = sv;
    }

    
}
