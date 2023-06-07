/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.NhanVien;
import help.ChuyenDoi;
import help.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class DALNhanVien {
    
    public static ResultSet LayTenNVTheoMa(String MANV) {
        String sql = "select HOVATEN from NHANVIEN where MANV = ?";
        return DBConnection.executeQuery(sql,MANV);
    }
    
    
    public static ResultSet GetAllData() {
        String string = "select * from NHANVIEN";
        return DBConnection.executeQuery(string);
    }

    public static void Insert(NhanVien nv) {
        String string
                = """
                   INSERT INTO [dbo].[NHANVIEN]
                             ([MANV]
                             ,[HOVATEN]
                             ,[GIOITINH]
                             ,[CHUCVU]
                             ,[NAMSINH]
                             ,[SDT]
                             ,[CCCD]
                             ,[EMAIL]
                             ,[NGAYVAOLAM]
                             ,[PHANQUYEN]
                             ,[TINHTRANG])
                       VALUES
                             (?,?,?,?,?,?,?,?,?,?,?)""";
        DBConnection.executeUpdate(string, nv.getMANV(), nv.getHOVATEN(), nv.isGIOITINH(), nv.getCHUCVU(), ChuyenDoi.LayNgayString(nv.getNAMSINH()), nv.getSDT(), nv.getCCCD(), nv.getEMAIL(),
                 ChuyenDoi.LayNgayString(nv.getNGAYVAOLAM()), nv.getPHANQUYEN(), nv.isTINHTRANG());
    }

    public static void Update(NhanVien nv) {
        String string = """
                        UPDATE [dbo].[NHANVIEN]
                           SET [HOVATEN] =?
                              ,[GIOITINH] = ?
                              ,[CHUCVU] = ?
                              ,[NAMSINH] = ?
                              ,[SDT] = ?
                              ,[CCCD] = ?
                              ,[EMAIL] = ?
                              ,[NGAYVAOLAM] = ?
                              ,[PHANQUYEN] = ?
                              ,[TINHTRANG] = ?
                         WHERE MANV = ?""";
        DBConnection.executeUpdate(string, nv.getHOVATEN(), nv.isGIOITINH(), nv.getCHUCVU(), ChuyenDoi.LayNgayString(nv.getNAMSINH()), nv.getSDT(), nv.getCCCD(), nv.getEMAIL(),
                 ChuyenDoi.LayNgayString(nv.getNGAYVAOLAM()), nv.getPHANQUYEN(), nv.isTINHTRANG(), nv.getMANV());
    }

    public static void Delete(String MANV) {
        String string = "Delete from NHANVIEN where MANV = ?";
        DBConnection.executeUpdate(string, MANV);
    }

    public static ResultSet Find(String TuKhoa) {
        String string = "select * from NHANVIEN "
                + " where HOVATEN like ? or SDT like ? or MANV like ?";
        TuKhoa = "%" + TuKhoa + "%";
        return DBConnection.executeQuery(string, TuKhoa, TuKhoa, TuKhoa);
    }
    
    public static ResultSet Login (String MaNV, String MatKhau){
        String sql = "select * from NHANVIEN where MANV = ? and MATKHAU = ? ";
        return DBConnection.executeQuery(sql, MaNV, MatKhau);
    }
    
    public static ResultSet CheckPassword (String MaNV, String MatKhau){
        String sql = "select * from NHANVIEN where MANV = ? and MATKHAU = ? ";
        return DBConnection.executeQuery(sql, MaNV, MatKhau);
    }
    
    public static void ChagnePass(NhanVien nv) {
        String sql = "update NHANVIEN set MATKHAU = ? where MANV = ?";
        DBConnection.executeUpdate(sql, nv.getMATKHAU(), nv.getMANV());
    }
    
   
}
