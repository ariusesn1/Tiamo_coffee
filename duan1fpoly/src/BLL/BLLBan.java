/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DTO.Ban;
import DTO.ThucDon;
import help.ChuyenDoi;
import help.DBConnection;
import help.MyCombobox;
import help.ThongBao;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class BLLBan {
    public static ArrayList<Ban> GetAll(){
        ResultSet rs = DAL.DALBan.GetAllData();
        
        ArrayList<Ban> arr = new ArrayList<>();
        
        try {
            while (rs.next()) {
                Ban ban = new Ban();
                ban.setMABAN(rs.getString("MABAN"));
                ban.setTENBAN(rs.getString("TENBAN"));
                ban.setLOAIBAN(rs.getString("LOAIBAN"));
                ban.setTRANGTHAI(rs.getInt("TRANGTHAI") == 0 ? "Trống":"Có người");
                arr.add(ban); 
            }
        } catch (Exception ex) {
            System.out.println("Lỗi lấy dữ liệu: " + ex.getMessage());
        }
        return arr;
    }
    
    
    public static int updateTinhTrang(String MABAN, boolean isStatus) {
        int i = -1;
        int TRANGTHAI = 0;
        if (isStatus) {
            TRANGTHAI = 1;
        }
        DAL.DALBan.updatetinhtrangban(MABAN, TRANGTHAI);
        return i;
    }
    
    
    public static int updateTinhTrang() {
        int i = -1;
        DAL.DALBan.updatetinhtrang();
        return i;
    }
    
    public static String LayTenBan(String MaBan){
        ResultSet rs = DAL.DALBan.LayTenBanTheoMa(MaBan);
        try {
            if(rs.next()){
                return rs.getString("TENBAN");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDonGian("Thông báo lỗi", "Lỗi lấy Tên Bàn");
        }
        return "";
    }
    
    
    
    public static void DoVaoTableDSBan(ArrayList<Ban> arr, JTable tbl){
        DefaultTableModel tbMode = (DefaultTableModel) tbl.getModel();
        
        tbMode.setRowCount(0);
        
        for(Ban ban : arr){
            Object obj[] = new Object[4];
  
            obj[0] = ban.getMABAN();
            obj[1] = ban.getTENBAN();
            obj[2] = ban.getLOAIBAN();
            obj[3] = ban.getTRANGTHAI();
            tbMode.addRow(obj);
        }
    }
    
    public static void DoVaoTableBanHD(ArrayList<Ban> arr, JTable tbl) {

            DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();

            tbModel.setRowCount(0); //Xóa het cac dong trong Table

            for (Ban ban : arr) {
                Object obj[] = new Object[4];
                obj[0] = ban.getMABAN();
                obj[1] = ban.getTENBAN();
                obj[2] = ban.getLOAIBAN();
                obj[3] = ban.getTRANGTHAI();
                
 
                tbModel.addRow(obj);
            }
    }
    
    public static boolean Check(Ban ban, boolean them) {
        if (them) {
            ResultSet rs = DAL.DALBan.LayBanTheoMa(ban.getMABAN());
            try {
                if (rs.next()) {
                    ThongBao.ThongBaoDonGian("Báo lỗi", "Mã bàn đã tồn tại");
                    return false;
                }
            } catch (SQLException ex) {
                ThongBao.ThongBaoDonGian("Báo lỗi", "Lỗi lấy dữ liệu");
                return false;
            }
        }

        return true;
    }
    
    public static void Add(Ban ban){
        if (Check(ban, true)) {
            DAL.DALBan.Add(ban);
        }
    }
    
    public static void delete(String MABAN){
        DAL.DALBan.delete(MABAN);
    }
    
    public static void update(Ban ban){
        if (Check(ban, false)) {
            DAL.DALBan.update(ban);
        }
    }
    


    
    
}
