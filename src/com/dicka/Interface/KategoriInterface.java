/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dicka.Interface;

import com.dicka.Entity.Kategori;
import java.util.List;

/**
 *
 * @author krypton
 */
public interface KategoriInterface {
    void insertKategori(Kategori kategori);
    List<Kategori> getKategoris();
}
