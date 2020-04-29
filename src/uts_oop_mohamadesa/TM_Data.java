/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_oop_mohamadesa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MohamadEsa
 */
public class TM_Data extends AbstractTableModel{

    List<Entitas> list = new ArrayList<>();
    
    public Entitas getEntitas(int index){
        return list.get(index);
    }
    
    public void insert(Entitas entitas){
        list.add(entitas);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
    
    public void update(Entitas entitas, int index){
        list.set(index, entitas);
        fireTableRowsUpdated(index, index);
    }
    
    public void delete(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
    }
    
//    public TM_Data(List<Entitas> list){
//        this.list = list;
//    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int col) {
       switch(col){
           case 0 : return "ID Barang";
           case 1 : return "Nama Barang";
           case 2 : return "Satuan";
           case 3 : return "Jumlah Jual";
           case 4 : return "Harga Satuan";
           case 5 : return "Tanggal Jual";
           default: return null;
       }
    }
    
    

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
           case 0 : return list.get(row).getId();
           case 1 : return list.get(row).getNamabarang();
           case 2 : return list.get(row).getSatuan();
           case 3 : return list.get(row).getJumlah();
           case 4 : return list.get(row).getHarga();
           case 5 : return list.get(row).getTanggal();
           default: return null;
        }
    }
    
}
