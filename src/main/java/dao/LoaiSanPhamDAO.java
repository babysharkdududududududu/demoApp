/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBConnection;
import entity.LoaiSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamDAO {
    private Connection con;
    public LoaiSanPhamDAO(){
        con = DBConnection.getInstance().getConnection();
    }
    public ArrayList<LoaiSanPham> getAllLoaiSP() throws SQLException{
        ArrayList<LoaiSanPham> dsloaiSP = new ArrayList<>();
        String sql = "Select * from LoaiThucPham";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            String ma = rs.getString(1);
            String ten = rs.getString(2);
            
            LoaiSanPham loaiSP =  new LoaiSanPham(ma, ten);
            dsloaiSP.add(loaiSP);
        }
        return dsloaiSP;
    }
    
}
