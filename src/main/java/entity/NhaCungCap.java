/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class NhaCungCap {
    private String maNCC;
    private String tenNCC;

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public NhaCungCap(String maNCC, String tenNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
    }

    public NhaCungCap(String maNCC) {
        this.maNCC = maNCC;
    }

    public NhaCungCap() {
    }

    @Override
    public String toString() {
        return "NhaCungCap{" + "maNCC=" + maNCC + ", tenNCC=" + tenNCC + '}';
    }
    
   

        
}
