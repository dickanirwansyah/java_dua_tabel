/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dicka.Entity;

/**
 *
 * @author krypton
 */
public class Barang {
    private int kdBarang;
    private String nama;
    private Kategori kategori;

    public int getKdBarang() {
        return kdBarang;
    }

    public void setKdBarang(int kdBarang) {
        this.kdBarang = kdBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return nama;
    }
    
    
}
