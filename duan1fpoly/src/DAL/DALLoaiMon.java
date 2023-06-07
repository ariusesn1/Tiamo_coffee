/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.LoaiMon;
import help.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class DALLoaiMon {
     //Hàm lấy tất cả dữ liệu
    public static ResultSet GetAllData(){
       String sql = "select * from LOAISANPHAM";
       ResultSet rs = DBConnection.executeQuery(sql);
       return rs;
    }
    
   
    //Hàm lấy Tên loại sản phẩm theo mã loại sản phẩm
    public static ResultSet FindByID(String MALOAI){
        String sql = "select * from LOAISANPHAM where MALOAI = ?";
        return DBConnection.executeQuery(sql, MALOAI);
    }
    
   
    //Hàm thêm loại sản phẩm
    public static void add(LoaiMon lh){
        String sql = "INSERT INTO [dbo].[LOAISANPHAM]([MALOAI],[TENLOAI]) VALUES(?,?)";
        DBConnection.executeUpdate(sql ,lh.getMALOAI(), lh.getTENLOAI());
    }
    
    //Hàm sửa loại sản phẩm
    public static void Update(LoaiMon lh){
        String sql = "UPDATE [dbo].[LOAISANPHAM] SET [TENLOAI] = ? "
                + "WHERE MALOAI = ?";
        DBConnection.executeUpdate(sql, lh.getTENLOAI(), lh.getMALOAI());
    }
    //Hàm xóa loại sản phẩm
    public static void delete(String MALOAI){
        String sqlDelete = "DELETE LOAISANPHAM where MALOAI = ?";
        DBConnection.executeUpdate(sqlDelete, MALOAI);
    }
    
}
