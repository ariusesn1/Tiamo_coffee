/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.ThucDon;
import help.ChuyenDoi;
import help.MyCombobox;
import help.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.JComboBox;
/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class BLLThucDon {
    public static ArrayList<ThucDon> GetAll(){
        ResultSet rs = DAL.DALThucDon.GetAllData(); 
        ArrayList<ThucDon> arr = new ArrayList<>();
        try {
            while(rs.next()){
                ThucDon td = new ThucDon();
                td.setMAMON(rs.getString("MAMON"));
                td.setTENMON(rs.getString("TENMON"));
                td.setMALOAI(rs.getString("MALOAI"));
                td.setDONVI(rs.getString("DONVI"));
                td.setGIABAN(rs.getDouble("GIABAN"));
                arr.add(td); 
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        
        return arr; 
    }
    
    //Hàm đổ dữ liệu lên Table
    public static void DoVaoTableThucDon(ArrayList<ThucDon> arr, JTable tbl){
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        tbModel.setRowCount(0);
        for(ThucDon td : arr){
            Object obj[] = new Object[5];
            obj[0] = td.getMAMON();
            obj[1] = td.getTENMON();
            obj[2] = BLLLoaiMon.GetName(td.getMALOAI()+ "") ; //Mã loại
            obj[3] = td.getDONVI();
            obj[4] = td.getGIABAN();
            tbModel.addRow(obj);
        }
    }
    
    public static ArrayList<ThucDon> Find(String TuKhoa) {
        ResultSet rs = DAL.DALThucDon.FindByName(TuKhoa);
        ArrayList<ThucDon> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                ThucDon td = new ThucDon();
                td.setMAMON(rs.getString("MAMON"));
                td.setTENMON(rs.getString("TENMON"));
                td.setDONVI(rs.getString("DONVI"));
                td.setGIABAN(rs.getDouble("GIABAN"));
                    
                arr.add(td); 
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
    public static String LayTenMon(String MAMON){
        ResultSet rs = DAL.DALThucDon.TimTenMonTheoMa(MAMON);
        try {
            if(rs.next()){
                return rs.getString("TENMON");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDonGian("Thông báo lỗi", "Lỗi lấy Tên Nhân Viên");
        }
        return "";
    }
    
  
       
    public static Vector timTenNuocHD(String tenmon, int soLuong) {
        Vector r = new Vector();
        try {
            for (ThucDon n : GetAll()) {
                if (n.getTENMON().equals(tenmon)) {
                    r.add(n.getMAMON());
                    r.add(tenmon);
                    r.add(soLuong);
                    r.add(n.getGIABAN());
                    r.add(soLuong * n.getGIABAN());
                    return r;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
        
//    public static ArrayList<ThucDon> layTTNuoc(String maLoai) {
//        ArrayList<ThucDon> ds = new ArrayList<>();
//        for (ThucDon TD : GetAll()) {
//            if (TD.getMALOAI().trim().toUpperCase().equals(maLoai.trim().toUpperCase())) {
//                ds.add(TD);
//            }
//        }
//        return ds;
//    }
    
    
    public static String GetName(String MALOAI){
        ResultSet rs = DAL.DALThucDon.TimMonTheoLoai(MALOAI);
        try {
            if(rs.next()){
                return rs.getString("TENLOAI");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDonGian("Thông báo lỗi", "Lỗi lấy Tên loại");
        }
        return "";
    }
    
    
    // Hàm thêm LSP
    public static void Add(ThucDon td) {
        DAL.DALThucDon.add(td);
    }
    
    public static void Delete(String MAMON){
        try {
            DAL.DALThucDon.delete(MAMON);
        } catch (Exception e) {
            ThongBao.ThongBaoCoIcon("Thông báo lỗi","Không thể xóa dữ liệu sản phẩm đang được sử dụng", 2);
        }
    }
    
    public static void Update(ThucDon td) {
        DAL.DALThucDon.Update(td);
    }
    
    public static void DoVaoTableThucDonHD(ArrayList<ThucDon> arr, JTable tbl) {
            DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
            tbModel.setRowCount(0);
            for (ThucDon td : arr) {
                Object obj[] = new Object[4];
                obj[0] = tbl.getRowCount() + 1;
                obj[1] = td.getTENMON();
                obj[2] = td.getDONVI();
                obj[3] = td.getGIABAN();
                
                tbModel.addRow(obj);
            }
    }
    
    //Hàm chọn hiển thị Loại sản phẩm theo table
    public static void HienThiLoaiMon(JComboBox cbb, String TenLoai){
        for (int i = 0; i < cbb.getItemCount(); i++) {
            MyCombobox myCBB = (MyCombobox)cbb.getItemAt(i);
            if(myCBB.toString().equals(TenLoai)){
                cbb.setSelectedIndex(i);
            }
        }
    }
}
