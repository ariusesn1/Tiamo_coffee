/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.ChamCong;
import help.ChuyenDoi;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class BLLChamCong {
    public static ArrayList<ChamCong> GetAll() {
        ResultSet rs = DAL.DALChamCong.GetAllData();
        ArrayList<ChamCong> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ChamCong cc = new ChamCong();
                cc.setMACC(rs.getInt("MACC"));
                cc.setMANV(rs.getString("MANV"));
                cc.setNGAYCC(rs.getDate("NGAYCC"));
                cc.setTRANGTHAICC(rs.getBoolean("TRANGTHAICC"));
        
                arr.add(cc);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
    public static ArrayList<ChamCong> Find(String NgayCC) {
        ResultSet rs = DAL.DALChamCong.TimKiem(NgayCC);
        ArrayList<ChamCong> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ChamCong cc = new ChamCong();
                cc.setMACC(rs.getInt("MACC"));
                cc.setMANV(rs.getString("MANV"));
                cc.setNGAYCC(rs.getDate("NGAYCC"));
                cc.setTRANGTHAICC(rs.getBoolean("TRANGTHAICC"));
        
                arr.add(cc);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
        
    public static void DoVaoTable(ArrayList<ChamCong> arr, JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        for (ChamCong cc : arr) {
            Object obj[] = new Object[4];
            obj[0] = cc.getMACC();
            obj[1] = cc.getMANV();
            obj[2] = ChuyenDoi.LayNgayString(cc.getNGAYCC());
            obj[3] = cc.isTRANGTHAICC() ? "Có mặt" : "Vắng";
            tbModel.addRow(obj);
        }
    }
    
     public static void Insert(ChamCong cc) {
        DAL.DALChamCong.Insert(cc);
    }
}
