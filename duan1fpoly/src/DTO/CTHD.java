/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class CTHD {
    String MAHD ;
    String MAMON;
    float DONGIA;
    int SOLUONG;

    public CTHD() {
    }

    public CTHD(String MAHD, String MAMON, float DONGIA, int SOLUONG) {
        this.MAHD = MAHD;
        this.MAMON = MAMON;
        this.DONGIA = DONGIA;
        this.SOLUONG = SOLUONG;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMAMON() {
        return MAMON;
    }

    public void setMAMON(String MAMON) {
        this.MAMON = MAMON;
    }

    public float getDONGIA() {
        return DONGIA;
    }

    public void setDONGIA(float DONGIA) {
        this.DONGIA = DONGIA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    
}
