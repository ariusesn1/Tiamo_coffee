/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class ThucDon {
    String MAMON;
    String TENMON;
    String MALOAI;
    String DONVI;
    double GIABAN;
   

    public ThucDon() {
    }

    public ThucDon(String MAMON, String TENMON, String MALOAI, String DONVI, double GIABAN) {
        this.MAMON = MAMON;
        this.TENMON = TENMON;
        this.MALOAI = MALOAI;
        this.DONVI = DONVI;
        this.GIABAN = GIABAN;
    }

    public String getMAMON() {
        return MAMON;
    }

    public void setMAMON(String MAMON) {
        this.MAMON = MAMON;
    }

    public String getTENMON() {
        return TENMON;
    }

    public void setTENMON(String TENMON) {
        this.TENMON = TENMON;
    }

    public String getMALOAI() {
        return MALOAI;
    }

    public void setMALOAI(String MALOAI) {
        this.MALOAI = MALOAI;
    }

    public String getDONVI() {
        return DONVI;
    }

    public void setDONVI(String DONVI) {
        this.DONVI = DONVI;
    }

    public double getGIABAN() {
        return GIABAN;
    }

    public void setGIABAN(double GIABAN) {
        this.GIABAN = GIABAN;
    }
}
