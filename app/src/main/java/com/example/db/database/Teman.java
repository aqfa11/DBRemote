package com.example.db.database;

import java.io.Serializable;

public class Teman implements Serializable {
    String id,nama,telepon;

    public Teman(String id,String nama,String telepon){
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
    }

    public Teman() { }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telepon;
    }

    public void setTelepon(String telp) {
        this.telepon = telp;
    }
}