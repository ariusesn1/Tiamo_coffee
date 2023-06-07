/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.ChamCong;
import help.ChuyenDoi;
import help.DBConnection;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class DALChamCong {
    public static ResultSet GetAllData() {
        String sql = "select * from CHAMCONG";
        return DBConnection.executeQuery(sql);
    }
    
    public static void Insert(ChamCong cc) {
        String sql
                = " INSERT INTO CHAMCONG (MANV, NGAYCC, TRANGTHAICC)"
                + "     VALUES(?,?,?)";
        DBConnection.executeUpdate(sql, cc.getMANV(), ChuyenDoi.LayNgayString(cc.getNGAYCC()), cc.isTRANGTHAICC());
    }
    
    public static ResultSet TimKiem(String NgayCC) {
        String sql = "select * from CHAMCONG where NGAYCC = ? ";
        return DBConnection.executeQuery(sql, NgayCC);
    }
}
