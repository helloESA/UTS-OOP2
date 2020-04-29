/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_oop_mohamadesa;

import java.util.Date;

/**
 *
 * @author MohamadEsa
 */
public class Entitas {
    private String id, namabarang, satuan;
            int jumlah, harga;
            Date tanggal;
    public Entitas(){}
    
    public Entitas(String id, String namabarang, String satuan, int jumlah, int harga, Date tanggal){
        this.id = id;
        this.namabarang = namabarang;
        this.satuan = satuan;
        this.jumlah = jumlah;
        this.harga = harga;
        this.tanggal = tanggal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
}
