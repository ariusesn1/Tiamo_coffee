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
public class ChamCong {
    int MACC;
    String MANV;
    Date NGAYCC;
    boolean TRANGTHAICC;

    public ChamCong() {
    }

    public ChamCong(int MACC, String MANV, Date NGAYCC, boolean TRANGTHAICC) {
        this.MACC = MACC;
        this.MANV = MANV;
        this.NGAYCC = NGAYCC;
        this.TRANGTHAICC = TRANGTHAICC;
    }

    public ChamCong(String MANV, Date NGAYCC, boolean TRANGTHAICC) {
        this.MANV = MANV;
        this.NGAYCC = NGAYCC;
        this.TRANGTHAICC = TRANGTHAICC;
    }

    public int getMACC() {
        return MACC;
    }

    public void setMACC(int MACC) {
        this.MACC = MACC;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public Date getNGAYCC() {
        return NGAYCC;
    }

    public void setNGAYCC(Date NGAYCC) {
        this.NGAYCC = NGAYCC;
    }

    public boolean isTRANGTHAICC() {
        return TRANGTHAICC;
    }

    public void setTRANGTHAICC(boolean TRANGTHAICC) {
        this.TRANGTHAICC = TRANGTHAICC;
    }

    
    
    
}


