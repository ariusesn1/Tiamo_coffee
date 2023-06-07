/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.HoaDon;
import help.ChuyenDoi;
import help.DBConnection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class DALHoaDon {
    public static ResultSet GetAllData() {
        String sql = "select * from HOADON";
        return DBConnection.executeQuery(sql);
    }
    //Hàm đếm số hóa đơn trong ngày
    public static ResultSet CountMaHD(String MaHD) {
        String sql = "select count(*) from  HOADON where MaHD like ?";
        return DBConnection.executeQuery(sql, MaHD);
    }
    
     //Hàm lấy hóa đơn theo số hóa đơn
    public static ResultSet GetHoaDonByMaHD(String MaHD) {
        String sql = "select * from HOADON where MAHD = ?";
        return DBConnection.executeQuery(sql, MaHD);
    }
    
    public static ResultSet FindHoaDonByIDKH(String IDKH) {
        String sql = "select * from HOADON where IDKH = ?";
        return DBConnection.executeQuery(sql, IDKH);
    }
    
    public static ResultSet FindHoaDon(String NgayLapHD) {
        String sql = "select * from HOADON where NGAYLAPHD = ? ";
        return DBConnection.executeQuery(sql, NgayLapHD);
    }
    
    public static void Insert(HoaDon hd) {
        String sql =  "INSERT INTO HOADON(MAHD, NGAYLAPHD, MANV, MABAN, IDKH, GIAMGIA, TONGTIEN) VALUES (?,?,?,?,?,?,?)"; 
        DBConnection.executeUpdate(sql, hd.getMAHD(), ChuyenDoi.LayNgayString(hd.getNGAYLAPHD()), hd.getMANV(), hd.getMABAN(), hd.getIDKH(), hd.getGIAMGIA(), hd.getTONGTIEN());
    }
}
