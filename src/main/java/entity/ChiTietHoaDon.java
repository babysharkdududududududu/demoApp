/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon {
    private int id;
    private HoaDon hoaDon;
    private SanPham sanPham;
    private int soLuong;
    private double giaBan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public ChiTietHoaDon(int id, HoaDon hoaDon, SanPham sanPham, int soLuong, double giaBan) {
        this.id = id;
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public ChiTietHoaDon() {
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" + "id=" + id + ", hoaDon=" + hoaDon + ", sanPham=" + sanPham + ", soLuong=" + soLuong + ", giaBan=" + giaBan + '}';
    }
    
}
