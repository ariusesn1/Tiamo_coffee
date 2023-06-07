/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.NhanVien;
import help.ChuyenDoi;
import help.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class BLLNhanVien {
    public static ArrayList<NhanVien> GetAll() {
        ResultSet rs = DAL.DALNhanVien.GetAllData();
        ArrayList<NhanVien> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMANV(rs.getString("MANV"));
                nv.setHOVATEN(rs.getString("HOVATEN"));
                nv.setGIOITINH(rs.getBoolean("GIOITINH"));
                nv.setCHUCVU(rs.getString("CHUCVU"));
                nv.setNAMSINH(rs.getDate("NAMSINH"));
                nv.setSDT(rs.getString("SDT"));
                nv.setCCCD(rs.getString("CCCD"));
                nv.setEMAIL(rs.getString("EMAIL"));
                nv.setNGAYVAOLAM(rs.getDate("NGAYVAOLAM"));
                nv.setPHANQUYEN(rs.getString("PHANQUYEN"));
                nv.setMATKHAU(rs.getString("MATKHAU"));
                nv.setTINHTRANG(rs.getBoolean("TINHTRANG"));
                
                arr.add(nv);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
     
    public static String LayTenNV(String MANV){
        ResultSet rs = DAL.DALNhanVien.LayTenNVTheoMa(MANV);
        try {
            if(rs.next()){
                return rs.getString("HOVATEN");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDonGian("Thông báo lỗi", "Lỗi lấy Tên Nhân Viên");
        }
        return "";
    }

    public static void DoVaoTable(ArrayList<NhanVien> arr, JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();

        tbModel.setRowCount(0);

        for (NhanVien nv : arr) {
            Object obj[] = new Object[11];

            obj[0] = nv.getMANV();
            obj[1] = nv.getHOVATEN();
            obj[2] = nv.isGIOITINH() ? "Nam":"Nữ";
            obj[3] = nv.getCHUCVU();
            obj[4] = ChuyenDoi.LayNgayString(nv.getNAMSINH());
            obj[5] = nv.getSDT();
            obj[6] = nv.getCCCD();
            obj[7] = nv.getEMAIL();
            obj[8] = ChuyenDoi.LayNgayString(nv.getNGAYVAOLAM());
            obj[9] = nv.getPHANQUYEN();
            obj[10] = nv.isTINHTRANG() ? "Đang làm" : "Đã nghỉ việc";
            tbModel.addRow(obj);
        }
    }

    public static ArrayList<NhanVien> Find(String TuKhoa) {
        ResultSet rs = DAL.DALNhanVien.Find(TuKhoa);
        ArrayList<NhanVien> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMANV(rs.getString("MANV"));
                nv.setHOVATEN(rs.getString("HOVATEN"));
                nv.setGIOITINH(rs.getBoolean("GIOITINH"));
                nv.setCHUCVU(rs.getString("CHUCVU"));
                nv.setNAMSINH(rs.getDate("NAMSINH"));
                nv.setSDT(rs.getString("SDT"));
                nv.setCCCD(rs.getString("CCCD"));
                nv.setEMAIL(rs.getString("EMAIL"));
                nv.setNGAYVAOLAM(rs.getDate("NGAYVAOLAM"));
                nv.setPHANQUYEN(rs.getString("PHANQUYEN"));
                nv.setTINHTRANG(rs.getBoolean("TINHTRANG"));
                arr.add(nv);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }

    public static void Insert(NhanVien nv) {
        DAL.DALNhanVien.Insert(nv);
    }

    public static void Update(NhanVien nv) {
        DAL.DALNhanVien.Update(nv);
    }

    public static void Delete(String MANV) {
        try {
            DAL.DALNhanVien.Delete(MANV);
        } catch (Exception e) {
            ThongBao.ThongBaoCoIcon("Thông báo lỗi",
                    "Không thể xóa dữ liệu khách hàng",
                    2);
        }
    }
    
    public static NhanVien CheckLogin(String MANV , String MATKHAU) {
        ResultSet rs = DAL.DALNhanVien.Login(MANV, MATKHAU); 
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMANV(rs.getString("MANV"));
                nv.setHOVATEN(rs.getString("HOVATEN"));
                nv.setPHANQUYEN(rs.getString("PHANQUYEN"));
                nv.setMATKHAU(rs.getString("MATKHAU"));
 
                return nv; 
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
            return null;
        }

        return null; 
    }
    
    public static NhanVien CheckPass(String MANV , String MATKHAU) {
        ResultSet rs = DAL.DALNhanVien.CheckPassword(MANV, MATKHAU); 
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMANV(rs.getString("MANV"));
                nv.setMATKHAU(rs.getString("MATKHAU"));
                return nv; 
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
            return null;
        }
        return null; 
    }
    
    public static void ChangePass(NhanVien nv) {
        DAL.DALNhanVien.ChagnePass(nv);
    }
}
