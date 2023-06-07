/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.HoaDon;
import help.ChuyenDoi;
import help.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class BLLHoaDon {
    public static ArrayList<HoaDon> GetAll() {
        ResultSet rs = DAL.DALHoaDon.GetAllData();
        ArrayList<HoaDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMAHD(rs.getString("MAHD"));
                hd.setNGAYLAPHD(rs.getDate("NGAYLAPHD"));
                hd.setMANV(rs.getString("MANV"));
                hd.setMABAN(rs.getString("MABAN"));
                hd.setIDKH(rs.getInt("IDKH"));
                hd.setGIAMGIA(rs.getInt("GIAMGIA"));
                hd.setTONGTIEN(rs.getInt("TONGTIEN"));
                arr.add(hd);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
     
    public static ArrayList<HoaDon> Find(String NgayLapHD) {
        ResultSet rs = DAL.DALHoaDon.FindHoaDon(NgayLapHD);
        ArrayList<HoaDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMAHD(rs.getString("MAHD"));
                hd.setNGAYLAPHD(rs.getDate("NGAYLAPHD"));
                hd.setMANV(rs.getString("MANV"));
                hd.setMABAN(rs.getString("MABAN"));
                hd.setIDKH(rs.getInt("IDKH"));
                hd.setGIAMGIA(rs.getInt("GIAMGIA"));
                hd.setTONGTIEN(rs.getInt("TONGTIEN"));
                arr.add(hd);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
        public static ArrayList<HoaDon> FindHDKH(String IDKH) {
        ResultSet rs = DAL.DALHoaDon.FindHoaDonByIDKH(IDKH);
        ArrayList<HoaDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMAHD(rs.getString("MAHD"));
                hd.setMANV(rs.getString("MANV"));
                hd.setNGAYLAPHD(rs.getDate("NGAYLAPHD"));
                hd.setTONGTIEN(rs.getInt("TONGTIEN"));
                arr.add(hd);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
    
    //Hàm lấy Mã hóa đơn 
    public static String LayHoaDon(String MaHD){
        ResultSet rs = DAL.DALHoaDon.GetHoaDonByMaHD(MaHD);
        try {
            if(rs.next()){
                return rs.getString("MAHD");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDonGian("Thông báo", "Lỗi lấy hóa đơn theo mã hóa đơn");
        }
        return "";
    } 
    

    
    public static String TinhTongTien(JTable tbl){
        double TongTien = 0 ;
        for(int i = 0; i < tbl.getRowCount(); i++){
                TongTien += ChuyenDoi.SoDouble(tbl.getValueAt(i, 3).toString());
        }
        return ChuyenDoi.SoString(TongTien);
    }
    
    
    
    public static String TaoMaHD() {
        String soHoaDon = "";
        try {

            DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

            Date d = new Date();

            soHoaDon = dateFormat.format(d);
            //System.out.println("soHoaDon: " + soHoaDon);
            ResultSet rs = DAL.DALHoaDon.CountMaHD(soHoaDon);
            int rowCount = 0;
            if (rs.next()) {
                rowCount = rs.getInt(1);
            }
            boolean dup = false;
            do {
                if (rowCount > 98) {
                    soHoaDon = soHoaDon + (rowCount + 1);
                } else if (rowCount > 8) {
                    soHoaDon = soHoaDon + "0" + (rowCount + 1);
                } else {
                    soHoaDon = soHoaDon + "000" + (rowCount + 1);
                }
                System.out.println("soHoaDon: " + soHoaDon);
                ResultSet rs2 = DAL.DALHoaDon.GetHoaDonByMaHD(soHoaDon);
                if (rs2.next()) {
                    dup = true;
                    rowCount++;
                    soHoaDon = dateFormat.format(d);
                } else {
                    dup = false;
                }
            } while (dup);

        } catch (SQLException ex) {
            System.out.println("Lỗi số hóa đơn");
        }

        return soHoaDon;
    }
    
    
    public static void DoVaoTable(ArrayList<HoaDon> arr, JTable tbl){
        DefaultTableModel tbMode = (DefaultTableModel) tbl.getModel();
        tbMode.setRowCount(0);
        for(HoaDon hd : arr){
            Object obj[] = new Object[6];
            obj[0] = hd.getMAHD();
            obj[1] = hd.getNGAYLAPHD();
            obj[2] = hd.getMANV();
            obj[3] = hd.getMABAN();
            obj[4] = hd.getGIAMGIA();
            obj[5] = hd.getTONGTIEN();
            tbMode.addRow(obj);
        }
    }
    
    public static void Insert(HoaDon hd) {
        DAL.DALHoaDon.Insert(hd);
    }
}
