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
public class Kategori {
    private int kdKategori;
    private String kategoris;
    
    public int getKdKategori(){
        return kdKategori;
    }
    
    public void setKdKategori(int kdKategori){
        this.kdKategori=kdKategori;
    }
    
    public String getKategoris(){
        return kategoris;
    }
    
    public void setKategoris(String kategoris){
        this.kategoris=kategoris;
    }

    @Override
    public String toString() {
        return kategoris;
    }
    
    
}
