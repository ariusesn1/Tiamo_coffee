/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class NhanVien {
    String MANV;
    String HOVATEN;
    boolean GIOITINH;
    String CHUCVU;
    Date NAMSINH;
    String SDT;
    String CCCD;
    String EMAIL;
    Date NGAYVAOLAM;
    String PHANQUYEN;
    String MATKHAU;
    boolean TINHTRANG;
    
    public NhanVien() {
    }

    public NhanVien(String MANV, String HOVATEN, boolean GIOITINH, String CHUCVU, Date NAMSINH, String SDT, String CCCD, String EMAIL, Date NGAYVAOLAM, String PHANQUYEN, boolean TINHTRANG) {
        this.MANV = MANV;
        this.HOVATEN = HOVATEN;
        this.GIOITINH = GIOITINH;
        this.CHUCVU = CHUCVU;
        this.NAMSINH = NAMSINH;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.EMAIL = EMAIL;
        this.NGAYVAOLAM = NGAYVAOLAM;
        this.PHANQUYEN = PHANQUYEN;
        this.TINHTRANG = TINHTRANG;
    }

    
    
    public NhanVien(String MANV, String HOVATEN, boolean GIOITINH, String CHUCVU, Date NAMSINH, String SDT, String CCCD, String EMAIL, Date NGAYVAOLAM, String PHANQUYEN, String MATKHAU, boolean TINHTRANG ) {
        this.MANV = MANV;
        this.HOVATEN = HOVATEN;
        this.GIOITINH = GIOITINH;
        this.CHUCVU = CHUCVU;
        this.NAMSINH = NAMSINH;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.EMAIL = EMAIL;
        this.NGAYVAOLAM = NGAYVAOLAM;
        this.PHANQUYEN = PHANQUYEN;
         this.MATKHAU = MATKHAU;
        this.TINHTRANG = TINHTRANG;
       
    }

    public NhanVien(String MANV, String HOVATEN, String PHANQUYEN, String MATKHAU) {
        this.MANV = MANV;
        this.HOVATEN = HOVATEN;
        this.PHANQUYEN = PHANQUYEN;
        this.MATKHAU = MATKHAU;
    }

    public NhanVien( String MANV, String MATKHAU) {
        this.MANV = MANV;
        this.MATKHAU = MATKHAU;
    }
    
    

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getHOVATEN() {
        return HOVATEN;
    }

    public void setHOVATEN(String HOVATEN) {
        this.HOVATEN = HOVATEN;
    }

    public boolean isGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(boolean GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getCHUCVU() {
        return CHUCVU;
    }

    public void setCHUCVU(String CHUCVU) {
        this.CHUCVU = CHUCVU;
    }

    public Date getNAMSINH() {
        return NAMSINH;
    }

    public void setNAMSINH(Date NAMSINH) {
        this.NAMSINH = NAMSINH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public Date getNGAYVAOLAM() {
        return NGAYVAOLAM;
    }

    public void setNGAYVAOLAM(Date NGAYVAOLAM) {
        this.NGAYVAOLAM = NGAYVAOLAM;
    }

    public String getPHANQUYEN() {
        return PHANQUYEN;
    }

    public void setPHANQUYEN(String PHANQUYEN) {
        this.PHANQUYEN = PHANQUYEN;
    }
    
    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }
    public boolean isTINHTRANG() {
        return TINHTRANG;
    }

    public void setTINHTRANG(boolean TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }
    
    
}
