/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dicka.Dao;

import com.dicka.Entity.Kategori;
import com.dicka.Interface.KategoriInterface;
import com.dicka.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krypton
 */
public class KategoriDao implements KategoriInterface{
    
    private Connection connection;
    public KategoriDao(){
        connection=DBConnection.getConnection();
    }

    @Override
    public void insertKategori(Kategori kategori) {
        PreparedStatement statement=null;
        String sql="insert into kategori (kd_kategori, kategori) values (?, ?)";
        try {
            statement=connection.prepareStatement(sql);
            statement.setInt(1, kategori.getKdKategori());
            statement.setString(2, kategori.getKategoris());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KategoriDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KategoriDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public List<Kategori> getKategoris() {
      PreparedStatement statement=null;
        ResultSet rs=null;
        List list=new ArrayList();
        String sql = "select * from kategori";
        try {
            statement=connection.prepareStatement(sql);
            rs=statement.executeQuery();
            while(rs.next()){
                Kategori k=new Kategori();
                k.setKdKategori(rs.getInt("kd_kategori"));
                k.setKategoris(rs.getString("kategori"));
                list.add(k);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KategoriDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KategoriDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KategoriDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
