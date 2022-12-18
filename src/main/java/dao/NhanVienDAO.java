/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBConnection;
import entity.LoaiSanPham;
import entity.NhanVien;
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
public class NhanVienDAO {
    private Connection con;
    public NhanVienDAO(){
        con = DBConnection.getInstance().getConnection();
    }
    public  ArrayList<NhanVien> getAllNhanVien() throws SQLException{
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        String sql = "Select * from NhanVien";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String maNV = rs.getString(1);
            String tenNV= rs.getString(2);
            Date ngaySinh = rs.getDate(3);
            int gioiTinh = rs.getInt(4);
            String diaChi = rs.getString(5);
            String chucVu = rs.getString(6);
            String trangThai = rs.getString(7);
            NhanVien nv = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, diaChi, chucVu, gioiTinh);
            dsnv.add(nv);
        }
        return dsnv;
    }
    
    
}
