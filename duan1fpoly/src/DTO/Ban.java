/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class Ban {
    private String MABAN;
    private String TENBAN;
    private String LOAIBAN;
    private String TRANGTHAI;

    public Ban() {
    }

    public Ban(String MABAN, String TENBAN, String LOAIBAN, String TRANGTHAI) {
        this.MABAN = MABAN;
        this.TENBAN = TENBAN;
        this.LOAIBAN = LOAIBAN;
        this.TRANGTHAI = TRANGTHAI;
    }


    public Ban(String MABAN, String TENBAN, String LOAIBAN) {
        this.MABAN = MABAN;
        this.TENBAN = TENBAN;
        this.LOAIBAN = LOAIBAN;
    }

    public Ban(String MABAN, String TRANGTHAI) {
        this.MABAN = MABAN;
        this.TRANGTHAI = TRANGTHAI;
    }

 

    public String getMABAN() {
        return MABAN;
    }

    public void setMABAN(String MABAN) {
        this.MABAN = MABAN;
    }

    public String getTENBAN() {
        return TENBAN;
    }

    public void setTENBAN(String TENBAN) {
        this.TENBAN = TENBAN;
    }

    public String getLOAIBAN() {
        return LOAIBAN;
    }

    public void setLOAIBAN(String LOAIBAN) {
        this.LOAIBAN = LOAIBAN;
    }

    public String getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(String TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    
    

    



    
}
