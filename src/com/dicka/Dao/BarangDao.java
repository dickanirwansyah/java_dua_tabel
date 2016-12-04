/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dicka.Dao;

import com.dicka.Entity.Barang;
import com.dicka.Interface.BarangInterface;
import com.dicka.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krypton
 */
public class BarangDao implements BarangInterface{
    
    private Connection connection;
    public BarangDao(){
        connection=DBConnection.getConnection();
    }

    @Override
    public void insertBarang(Barang barang) {
        PreparedStatement statement=null;
        String sql="insert into barang (kd_barang, nama, kd_kategori) values (?, ?, ?)";
        try {
            statement=connection.prepareStatement(sql);
            statement.setInt(1, barang.getKdBarang());
            statement.setString(2, barang.getNama());
            statement.setInt(3, barang.getKategori().getKdKategori());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BarangDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BarangDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
