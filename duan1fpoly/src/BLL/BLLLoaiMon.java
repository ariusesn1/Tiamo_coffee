/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.LoaiMon;
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
public class BLLLoaiMon {
    public static ArrayList<LoaiMon> GetAll(){
        ResultSet rs = DAL.DALLoaiMon.GetAllData();
        ArrayList<LoaiMon> arr = new ArrayList<>();
        
        try {
            while(rs.next()){
                LoaiMon lh = new LoaiMon();
                lh.setMALOAI(rs.getString("MALOAI"));
                lh.setTENLOAI(rs.getString("TENLOAI"));
 
                arr.add(lh); 
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        
        return arr; 
    }
    
    //Hàm đổ dữ liệu lên Table
    public static void DoVaoTableLoaiSP(ArrayList<LoaiMon> arr, JTable tbl){
        
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        tbModel.setRowCount(0);
        for(LoaiMon lh : arr){
            Object obj[] = new Object[2];
            obj[0] = lh.getMALOAI();
            obj[1] = lh.getTENLOAI();

            tbModel.addRow(obj);
        }
    }
    
    public static void DoVaoCombobox(ArrayList<LoaiMon> arr, JComboBox cbb){
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
        cbbModel.removeAllElements(); //Xóa những items còn trong CBB
        for (LoaiMon lsp : arr) {
            Object value = lsp.getMALOAI();   //Lưu vào database
            Object text = lsp.getTENLOAI();     //Hiển thị lên giao diện
            MyCombobox myCbb = new MyCombobox(value, text);
            cbbModel.addElement(myCbb);     //Thêm vào CBB
        }
    }
    
   //Hàm lấy Tên loại sản phẩm dựa vào MaLoaiSP
    public static String GetName(String MALOAI){
        ResultSet rs = DAL.DALLoaiMon.FindByID(MALOAI);
        try {
            if(rs.next()){
                return rs.getString("TENLOAI");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDonGian("Thông báo lỗi", "Lỗi lấy Tên loại hàng");
        }
        return "";
    }
    
    public static boolean Check(LoaiMon lm, boolean them) {
        if (them) {
            ResultSet rs = DAL.DALLoaiMon.FindByID(lm.getMALOAI());
            try {
                if (rs.next()) {
                    ThongBao.ThongBaoDonGian("Báo lỗi", "Mã loại đã tồn tại");
                    return false;
                }
            } catch (SQLException ex) {
                ThongBao.ThongBaoDonGian("Báo lỗi", "Lỗi lấy dữ liệu");
                return false;
            }
        }

        return true;
    }
    
    
    // Hàm thêm LSP
    public static void Add(LoaiMon lm){
        if (Check(lm, true)) {
            DAL.DALLoaiMon.add(lm);
        }
    }
    
    public static void Delete(String MALOAI){
        try {
            DAL.DALLoaiMon.delete(MALOAI);
        } catch (Exception e) {
            ThongBao.ThongBaoCoIcon("Thông báo lỗi","Không thể xóa dữ liệu sản phẩm đang được sử dụng", 2);
        }
    }
    
    public static void update(LoaiMon lm){
        if (Check(lm, false)) {
            DAL.DALLoaiMon.Update(lm);
        }
    }
}
