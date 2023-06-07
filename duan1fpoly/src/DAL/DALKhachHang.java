/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.KhachHang;
import help.ChuyenDoi;
import help.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class DALKhachHang {
     public static ResultSet GetAllData() {
        String sql = "select * from KHACHHANG";
        return DBConnection.executeQuery(sql);
    }

    public static void Insert(KhachHang kh) {
        String sql
                = " INSERT INTO KHACHHANG"
                + "           (LOAIKH,HOVATEN,SDT,NGAYTAOKH,DIEMTICHLUY)"
                + "     VALUES(?,?,?,?,?)";
        DBConnection.executeUpdate(sql, kh.getLOAIKH(), kh.getHOVATEN(), kh.getSDT(), ChuyenDoi.LayNgayString(kh.getNGAYTAOKH()), kh.getDIEMTICHLUY());
    }

    public static void Update(KhachHang kh) {
        String sql = "UPDATE [dbo].[KHACHHANG]"
                + "   SET [LOAIKH] = ?"
                + "      ,[HOVATEN] = ?"
                + "      ,[SDT] = ?"
                + "      ,[NGAYTAOKH] = ?"
                + "      ,[DIEMTICHLUY] = ?"
                + " WHERE IDKH = ?";
        DBConnection.executeUpdate(sql, kh.getLOAIKH(), kh.getHOVATEN(), kh.getSDT(), ChuyenDoi.LayNgayString(kh.getNGAYTAOKH()), kh.getDIEMTICHLUY(), kh.getIDKH());
    }

    public static void Delete(int IDKH) {
        String string = "Delete from KHACHHANG where IDKH = ?";
        DBConnection.executeUpdate(string, IDKH);
    }

        public static ResultSet FindByNameOrSDT(String TuKhoa) {
            String string = "select * from KHACHHANG "
                    + " where HOVATEN like ? or SDT like ?";
            TuKhoa = "%" + TuKhoa + "%";
            return DBConnection.executeQuery(string, TuKhoa , TuKhoa);
        }
    
    public static ResultSet TimKHTheoID(String ID){
        String sql = "select * from KHACHHANG where IDKH = ?";
        return DBConnection.executeQuery(sql, ID);
    }
}
