/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String sdtKhachHang;
    private String tenKhachHang;
    private int soDonDaMua;
    private double tienTichLuy;
    private int trangThai;

    public String getSdtKhachHang() {
        return sdtKhachHang;
    }

    public void setSdtKhachHang(String sdtKhachHang) {
        this.sdtKhachHang = sdtKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getSoDonDaMua() {
        return soDonDaMua;
    }

    public void setSoDonDaMua(int soDonDaMua) {
        this.soDonDaMua = soDonDaMua;
    }

    public double getTienTichLuy() {
        return tienTichLuy;
    }

    public void setTienTichLuy(double tienTichLuy) {
        this.tienTichLuy = tienTichLuy;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public KhachHang(String sdtKhachHang, String tenKhachHang, int soDonDaMua, double tienTichLuy, int trangThai) {
        this.sdtKhachHang = sdtKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.soDonDaMua = soDonDaMua;
        this.tienTichLuy = tienTichLuy;
        this.trangThai = trangThai;
    }

    public KhachHang() {
    }

    @Override
    public String toString() {
        return "KhachHang{" + "sdtKhachHang=" + sdtKhachHang + ", tenKhachHang=" + tenKhachHang + ", soDonDaMua=" + soDonDaMua + ", tienTichLuy=" + tienTichLuy + ", trangThai=" + trangThai + '}';
    }
    
            
}
