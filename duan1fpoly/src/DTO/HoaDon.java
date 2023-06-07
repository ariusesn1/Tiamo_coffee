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
public class HoaDon {
    String MAHD;
    Date NGAYLAPHD;
    String MANV;
    String MABAN;
    int IDKH;
    int GIAMGIA;
    double TONGTIEN;

    public HoaDon() {
    }

    public HoaDon(String MAHD, Date NGAYLAPHD, String MANV, String MABAN, int IDKH, int GIAMGIA, double TONGTIEN) {
        this.MAHD = MAHD;
        this.NGAYLAPHD = NGAYLAPHD;
        this.MANV = MANV;
        this.MABAN = MABAN;
        this.IDKH = IDKH;
        this.GIAMGIA = GIAMGIA;
        this.TONGTIEN = TONGTIEN;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public Date getNGAYLAPHD() {
        return NGAYLAPHD;
    }

    public void setNGAYLAPHD(Date NGAYLAPHD) {
        this.NGAYLAPHD = NGAYLAPHD;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMABAN() {
        return MABAN;
    }

    public void setMABAN(String MABAN) {
        this.MABAN = MABAN;
    }

    public int getIDKH() {
        return IDKH;
    }

    public void setIDKH(int IDKH) {
        this.IDKH = IDKH;
    }

    public int getGIAMGIA() {
        return GIAMGIA;
    }

    public void setGIAMGIA(int GIAMGIA) {
        this.GIAMGIA = GIAMGIA;
    }

    public double getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(double TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }
    
    
    
   
}
