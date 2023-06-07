/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.KhachHang;
import help.ChuyenDoi;
import help.MyCombobox;
import help.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class BLLKhachHang {
    public static ArrayList<KhachHang> GetAll() {
        ResultSet rs = DAL.DALKhachHang.GetAllData();
        ArrayList<KhachHang> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setIDKH(rs.getInt("IDKH"));
                kh.setLOAIKH(rs.getString("LOAIKH"));
                kh.setHOVATEN(rs.getString("HOVATEN"));
                kh.setSDT(rs.getString("SDT"));
                kh.setNGAYTAOKH(rs.getDate("NGAYTAOKH"));
                kh.setDIEMTICHLUY(rs.getInt("DIEMTICHLUY"));
                arr.add(kh);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
        
        public static void DoVaoTable(ArrayList<KhachHang> arr, JTable tbl) {

        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();

        tbModel.setRowCount(0);

        for (KhachHang kh : arr) {
            Object obj[] = new Object[6];

            obj[0] = kh.getIDKH();
            obj[1] = kh.getHOVATEN();
            obj[2] = kh.getLOAIKH();
            obj[3] = kh.getSDT();
            obj[4] = ChuyenDoi.LayNgayString(kh.getNGAYTAOKH());
            obj[5] = kh.getDIEMTICHLUY();
            tbModel.addRow(obj);
        }
    }
        
        
        
    public static ArrayList<KhachHang> Find(String TuKhoa) {
        ResultSet rs = DAL.DALKhachHang.FindByNameOrSDT(TuKhoa);
        ArrayList<KhachHang> arr = new ArrayList<>();
        try {
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setIDKH(rs.getInt("IDKH"));
                kh.setLOAIKH(rs.getString("LOAIKH"));
                kh.setHOVATEN(rs.getString("HOVATEN"));
                kh.setSDT(rs.getString("SDT"));
                kh.setNGAYTAOKH(rs.getDate("NGAYTAOKH"));
                kh.setDIEMTICHLUY(rs.getInt("DIEMTICHLUY"));
                arr.add(kh);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
       
        
    public static void Delete(int IDKH) {
        try {
            DAL.DALKhachHang.Delete(IDKH);
        } catch (Exception e) {
            ThongBao.ThongBaoCoIcon("Thông báo lỗi",
                    "Không thể xóa dữ liệu khách hàng",
                    2);
        }
    }
        
    public static void Insert(KhachHang kh) {
        DAL.DALKhachHang.Insert(kh); 
    }

    public static void Update(KhachHang kh) {
        DAL.DALKhachHang.Update(kh); 
    }
    
    public static void DoVaoComboboxKH(ArrayList<KhachHang> arr, JComboBox cbb){
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
        cbbModel.removeAllElements(); //Xóa những items còn trong CBB
        for (KhachHang kh : arr) {
            Object value = kh.getIDKH();   //Lưu vào database
            Object text = kh.getHOVATEN();     //Hiển thị lên giao diện
            MyCombobox myCbb = new MyCombobox(value, text);
            cbbModel.addElement(myCbb);     //Thêm vào CBB
        }
    }
    
   //Hàm lấy Tên KH dựa vào Mã KH
    public static String GetNameKH(String IDKH){
        ResultSet rs = DAL.DALKhachHang.TimKHTheoID(IDKH);
        try {
            if(rs.next()){
                return rs.getString("TenKH");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDonGian("Thông báo lỗi", "Lỗi lấy Tên Khách Hàng");
        }
        return "";
    }
    
    //Hàm chọn hiển thị khách hàng theo table
    public static void HienThiLoaiKH(JComboBox cbb, String TenKH){
        for (int i = 0; i < cbb.getItemCount(); i++) {
            MyCombobox myCBB = (MyCombobox)cbb.getItemAt(i);
            if(myCBB.toString().equals(TenKH)){
                cbb.setSelectedIndex(i);
            }
        }
    }
        
        
}
