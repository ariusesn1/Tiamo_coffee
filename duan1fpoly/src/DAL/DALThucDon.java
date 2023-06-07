/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.LoaiMon;
import DTO.ThucDon;
import help.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class DALThucDon {
    public static ResultSet GetAllData(){
       String sql = "select * from THUCDONMON";
       ResultSet rs = DBConnection.executeQuery(sql);
       return rs;
    }
    
    public static ResultSet TimMonTheoLoai(String MALOAI){
       String sql = "select * from THUCDONMON where MALOAI = ?";
       ResultSet rs = DBConnection.executeQuery(sql,MALOAI);
       return rs;
    }
    
    public static ResultSet TimTenMonTheoMa(String MAMON) {
        String sql = "select TENMON from THUCDONMON where MAMON = ?";
        return DBConnection.executeQuery(sql,MAMON);
    }
    
    public static ResultSet FindByName(String TuKhoa) {
        String string = "select * from THUCDONMON "
                + " where TENMON like ?";
        TuKhoa = "%" + TuKhoa + "%";
        return DBConnection.executeQuery(string, TuKhoa);
    }
    
   
    //Hàm thêm loại sản phẩm
    public static void add(ThucDon td){
        String sql = "INSERT INTO [dbo].[THUCDONMON]([MAMON], [TENMON],[MALOAI],[DONVI],[GIABAN]) VALUES(?,?,?,?,?)";
        DBConnection.executeUpdate(sql ,td.getMAMON() ,td.getTENMON(), td.getMALOAI(), td.getDONVI(), td.getGIABAN());
    }
    
    //Hàm sửa loại sản phẩm
    public static void Update(ThucDon td){
        String sql = "UPDATE [dbo].[THUCDONMON] SET [TENMON] = ?, [MALOAI] = ?, [DONVI] = ?, [GIABAN] = ? "
                + "WHERE MAMON = ?";
        DBConnection.executeUpdate(sql, td.getTENMON(), td.getMALOAI(), td.getDONVI(), td.getGIABAN(), td.getMAMON());
    }
    //Hàm xóa loại sản phẩm
    public static void delete(String MAMON){
        String sqlDelete = "DELETE THUCDONMON where MAMON = ?";
        DBConnection.executeUpdate(sqlDelete, MAMON);
    }
}

