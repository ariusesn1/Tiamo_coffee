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
public class KhachHang {
     int IDKH;
    String LOAIKH;
    String HOVATEN;
    String SDT;
    Date NGAYTAOKH;
    int DIEMTICHLUY;

    public KhachHang() {
    }

    public KhachHang(String LOAIKH, String HOVATEN, String SDT, Date NGAYTAOKH, int DIEMTICHLUY) {
        this.LOAIKH = LOAIKH;
        this.HOVATEN = HOVATEN;
        this.SDT = SDT;
        this.NGAYTAOKH = NGAYTAOKH;
        this.DIEMTICHLUY = DIEMTICHLUY;
    }
    
    public KhachHang(int IDKH, String LOAIKH, String HOVATEN, String SDT, Date NGAYTAOKH, int DIEMTICHLUY ) {
        this.IDKH = IDKH;
        this.LOAIKH = LOAIKH;
        this.HOVATEN = HOVATEN;
        this.SDT = SDT;
        this.NGAYTAOKH = NGAYTAOKH;
        this.DIEMTICHLUY = DIEMTICHLUY;
    }

    public int getIDKH() {
        return IDKH;
    }

    public void setIDKH(int IDKH) {
        this.IDKH = IDKH;
    }

    public String getLOAIKH() {
        return LOAIKH;
    }

    public void setLOAIKH(String LOAIKH) {
        this.LOAIKH = LOAIKH;
    }

    public String getHOVATEN() {
        return HOVATEN;
    }

    public void setHOVATEN(String HOVATEN) {
        this.HOVATEN = HOVATEN;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNGAYTAOKH() {
        return NGAYTAOKH;
    }

    public void setNGAYTAOKH(Date NGAYTAOKH) {
        this.NGAYTAOKH = NGAYTAOKH;
    }

    public int getDIEMTICHLUY() {
        return DIEMTICHLUY;
    }

    public void setDIEMTICHLUY(int DIEMTICHLUY) {
        this.DIEMTICHLUY = DIEMTICHLUY;
    }
    
}
