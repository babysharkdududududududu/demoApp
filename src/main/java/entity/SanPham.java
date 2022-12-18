/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String maThucPham;
    private LoaiSanPham loaiSanPham;
    private NhaCungCap nhaCungCap;
    private String tenThucPham;
    private String danhMuc;
    private String donVi;
    private int soLuong;
    private double giaNhap;
    private double giaBan;
    private Date ngaySX;
    private Date hanSD;
    private String img;
    private int trangThai;

    public String getMaThucPham() {
        return maThucPham;
    }

    public void setMaThucPham(String maThucPham) {
        this.maThucPham = maThucPham;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getTenThucPham() {
        return tenThucPham;
    }

    public void setTenThucPham(String tenThucPham) {
        this.tenThucPham = tenThucPham;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getHanSD() {
        return hanSD;
    }

    public void setHanSD(Date hanSD) {
        this.hanSD = hanSD;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }   

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public SanPham(String maThucPham, LoaiSanPham loaiSanPham, NhaCungCap nhaCungCap, String tenThucPham, String danhMuc, String donVi, int soLuong, double giaNhap, double giaBan, Date ngaySX, Date hanSD, String img, int trangThai) {
        this.maThucPham = maThucPham;
        this.loaiSanPham = loaiSanPham;
        this.nhaCungCap = nhaCungCap;
        this.tenThucPham = tenThucPham;
        this.danhMuc = danhMuc;
        this.donVi = donVi;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.ngaySX = ngaySX;
        this.hanSD = hanSD;
        this.img = img;
        this.trangThai = trangThai;
    }

    public SanPham() {
    }

    @Override
    public String toString() {
        return "SanPham{" + "maThucPham=" + maThucPham + ", loaiSanPham=" + loaiSanPham + ", nhaCungCap=" + nhaCungCap + ", tenThucPham=" + tenThucPham + ", danhMuc=" + danhMuc + ", donVi=" + donVi + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", ngaySX=" + ngaySX + ", hanSD=" + hanSD + ", img=" + img + ", trangThai=" + trangThai + '}';
    }
    
}
