package com.example.parts.entity;

import javax.persistence.*;

//Parts Entity
@Entity
@Table(name = "parts")
public class Parts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parts_id")
    private int parts_id;

    @Column(name = "CPU")
    private String cpu;

    @Column(name = "RAM")
    private String ram;

    @Column(name = "OS")
    private String os;

    @Column(name = "storage")
    private String storage;

    //default constructor
    public Parts() {
    }

    public Parts(String cpu, String ram, String os) {
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
    }

    public Parts(String cpu, String ram, String os, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
        this.storage = storage;
    }

    public int getParts_id() {
        return parts_id;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    public String getStorage() {
        return storage;
    }

    public void setParts_id(int parts_id) {
        this.parts_id = parts_id;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "parts_id=" + parts_id +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", os='" + os + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}

