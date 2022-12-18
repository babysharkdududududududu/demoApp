/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ql.ql;

import gui.Gui_DangNhap;
import gui.Menu;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class QL {
    public static String random(String x){
        Random rd = new Random();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String ma = x + sdf.format(date)  + String.format("%04d", rd.nextInt(1000));
        return ma;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(random("NV"));
        
//        new Gui_DangNhap().setVisible(true);
           new Menu().setVisible(true);
    }
}
