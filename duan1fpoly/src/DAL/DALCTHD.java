/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.CTHD;
import help.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class DALCTHD {
    public static ResultSet GetAllData(){
       String sql = "select * from CHITIETHOADON";
       ResultSet rs = DBConnection.executeQuery(sql);
       return rs;
    }
    
    //Hàm tìm kiếm Sản phẩm theo MaSp
    public static ResultSet FindByMaHD(String MaHD){
        String sql = "select * from CHITIETHOADON where MAHD = ?";
        return DBConnection.executeQuery(sql, MaHD);
    }
    //Hàm Thêm chi tiết hóa đơn
    public static void InsertCTHD(CTHD cthd) {
        String sql = "insert into CHITIETHOADON (MAHD, MAMON, DONGIA, SOLUONG)values (?,?,?,?)";
        DBConnection.executeUpdate(sql,cthd.getMAHD(), cthd.getMAMON(), cthd.getDONGIA(), cthd.getSOLUONG());
    }
}
