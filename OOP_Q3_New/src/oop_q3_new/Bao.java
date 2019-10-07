/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_q3_new;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Thu Uyên
 */
public class Bao extends TaiLieu{
    private Date ngayPh;

    public Bao() {
    }

    public Bao(Date ngayPh, String ma, String tenNxb,int sobph) {
        super(ma, tenNxb, sobph);
        this.ngayPh = ngayPh;
    }

    public Date getNgayPh() {
        return ngayPh;
    }

    public void setNgayPh(Date ngayPh) {
        this.ngayPh = ngayPh;
    }
    public String SimpleDate(){
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        String ngay = df.format(ngayPh);
        return ngay;
    }
    public String toString(){
        return super.toString()+"\t"+ngayPh;
    }
    
}
