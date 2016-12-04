/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dicka.TabelModel;

import com.dicka.Entity.Kategori;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author krypton
 */
public class TabelModelKategori extends AbstractTableModel{
    
    private List<Kategori> list=new ArrayList<Kategori>();
    public TabelModelKategori(){
        
    }

    @Override
    public int getRowCount() {
     return list.size();
    }

    @Override
    public int getColumnCount() {
     return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     switch(columnIndex){
        case 0 : return list.get(rowIndex).getKdKategori();
        case 1 : return list.get(rowIndex).getKategoris();
        default:return null;
     }
    }

    @Override
    public String getColumnName(int column) {
       switch(column){
           case 0 : return "kode";
           case 1 : return "kategori";
           default:return null;
       }
    }
    
    public void setData(List<Kategori> list){
        this.list=list;
        fireTableDataChanged();
    }
    
    public Kategori getKategori(int index){
        return list.get(index);
    }
    
}
