/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.CTHD;
import DTO.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class BLLCTHD {
    public static ArrayList<CTHD> GetAll() {
        ResultSet rs = DAL.DALCTHD.GetAllData();
        ArrayList<CTHD> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                CTHD cthd = new CTHD();
                cthd.setMAHD(rs.getString("MAHD"));
                cthd.setMAMON(rs.getString("MAMON"));
                cthd.setDONGIA(rs.getFloat("DONGIA"));
                cthd.setSOLUONG(rs.getInt("SOLUONG"));
                
                arr.add(cthd);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
    public static ArrayList<CTHD> timKiem(String tuKhoa) {
        ArrayList<CTHD> ds = new ArrayList<>();
        for (CTHD ct : GetAll()) {
            if (ct.getMAHD().toUpperCase().trim().equals(tuKhoa.trim().toUpperCase())
                ||BLLThucDon.LayTenMon(ct.getMAMON().trim().toUpperCase()).trim().toUpperCase().contains(tuKhoa.trim().toUpperCase())){
                ds.add(ct);
            }
        }
        return ds;
    }
    
    
    
    
    public static void Insert(CTHD cthd) {
        DAL.DALCTHD.InsertCTHD(cthd);
    }
}
