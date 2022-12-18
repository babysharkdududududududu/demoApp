/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBConnection;
import entity.LoaiSanPham;
import entity.NhaCungCap;
import entity.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class SanPhamDAO {
    private Connection con;
    public SanPhamDAO(){
        con = DBConnection.getInstance().getConnection();
    }
    public ArrayList<SanPham> getAllSanPham() throws SQLException{
        ArrayList<SanPham> dssp = new ArrayList<>();
        String sql = "Select * from ThucPham";
        Statement  stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String maSP  = rs.getString(1);
            LoaiSanPham maLoai  = new LoaiSanPham(rs.getString(2));
            NhaCungCap maNCC  = new NhaCungCap(rs.getString(3));
            String tenSP  = rs.getString(4);
            String danhMuc  = rs.getString(5);
            String donVi  = rs.getString(6);
            int soLuong  = rs.getInt(7);
            Double giaNhap  = rs.getDouble(8);
            Double giaBan  = rs.getDouble(9);
            Date ngaySX  = rs.getDate(10);
            Date hanSD  = rs.getDate(11);
            String img  = rs.getString(12);
            int trangThai  = rs.getInt(13);

            SanPham sp = new SanPham(maSP, maLoai, maNCC, tenSP,danhMuc, donVi, soLuong, giaNhap, giaBan, ngaySX, hanSD, img, trangThai);
            dssp.add(sp);
        }
        return dssp;
    }
    
    public  ArrayList<SanPham> locLoaiSP(String x) throws SQLException{
            ArrayList<SanPham> dssp = new ArrayList<>();
            String sql  = "select *from ThucPham  where danhMuc = ? and trangThai  = 1 ";
            PreparedStatement prestmt = con.prepareStatement(sql);
            prestmt.setString(1, x);
            ResultSet rs = prestmt.executeQuery();
            while(rs.next()){
                String maSP  = rs.getString(1);
                LoaiSanPham maLoai  = new LoaiSanPham(rs.getString(2));
                NhaCungCap maNCC  = new NhaCungCap(rs.getString(3));
                String tenSP  = rs.getString(4);
                String danhMuc  = rs.getString(5);
                String donVi  = rs.getString(6);
                int soLuong  = rs.getInt(7);
                Double giaNhap  = rs.getDouble(8);
                Double giaBan  = rs.getDouble(9);
                Date ngaySX  = rs.getDate(10);
                Date hanSD  = rs.getDate(11);
                String img  = rs.getString(12);
                int trangThai  = rs.getInt(13);

            SanPham sp = new SanPham(maSP, maLoai, maNCC, tenSP,danhMuc, donVi, soLuong, giaNhap, giaBan, ngaySX, hanSD, img, trangThai);
            dssp.add(sp);
        }
        return dssp;
    }
}
