/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Ban;
import java.sql.ResultSet;
import help.DBConnection;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class DALBan {
    public static ResultSet GetAllData() {
        String sql = "select * from BAN";
        ResultSet rs = DBConnection.executeQuery(sql);
        return rs;
    }
    
    public static ResultSet LayBanTheoMa(String MABAN){
        String sql = "select * from BAN where MABAN = ?";
        return DBConnection.executeQuery(sql, MABAN);
    }
    
    public static ResultSet LayTenBanTheoMa(String MaBan) {
        String sql = "select * from BAN where MABAN = ?";
        ResultSet rs = DBConnection.executeQuery(sql, MaBan);
        return rs;
    }
    
    public static ResultSet LayTrangThaiBanTheoMa(String MABAN) {
        String sql = "select TRANGTHAI from BAN where MABAN = ?";
        ResultSet rs = DBConnection.executeQuery(sql, MABAN);
        return rs;
    }
    
    public static ResultSet LayMaTheoTen(String TenBan) {
        String sql = "select IDBAN from BAN where TENBAN = ?";
        ResultSet rs = DBConnection.executeQuery(sql, TenBan);
        return rs;
    }
    
    public static void Add(Ban ban) {
        String sql =  "INSERT INTO BAN(MABAN, TENBAN, LOAIBAN, TRANGTHAI) VALUES (?,?,?,?)"; 
        DBConnection.executeUpdate(sql, ban.getMABAN(), ban.getTENBAN(), ban.getLOAIBAN(), ban.getTRANGTHAI());
    }
    
    public static void update(Ban ban) {
        String sql =  "UPDATE BAN SET TENBAN = ? , LOAIBAN = ?  where MABAN = ?"; 
        DBConnection.executeUpdate(sql, ban.getTENBAN(), ban.getLOAIBAN(), ban.getMABAN());
    }
    
    public static void delete(String MABAN) {
        String sqlDelete ="DELETE BAN where MABAN = ? "; 
        DBConnection.executeUpdate(sqlDelete, MABAN);
    }
    
    public static void updatetinhtrang() {
        String sql =  "UPDATE BAN SET TRANGTHAI = 0"; 
        DBConnection.executeUpdate(sql);
    }
    
    public static void updatetinhtrangban(String MABAN, int TRANGTHAI) {
        String sql =  "update BAN set TRANGTHAI = ? where MABAN = ?";
        DBConnection.executeUpdate(sql, TRANGTHAI, MABAN);
    }
    

}
