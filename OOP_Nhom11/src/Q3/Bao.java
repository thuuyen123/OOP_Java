/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Bao extends TaiLieu{
    private Date ngayPH;

    public Bao() {
    
    }

    public Bao(Date ngayPH, String ma, String tenNXB, int soBPH) {
        super(ma, tenNXB, soBPH);
        this.ngayPH = ngayPH;
    }

    public Date getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(Date ngayPH) {
        this.ngayPH = ngayPH;
    }
    public String SimpleDate(){
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        String ngay = df.format(ngayPH);
        return ngay;
    }
    @Override
    public String toString(){
        return super.getMa() +"\t"+super.getTenNXB() +"\t"+super.getSoBPH()+"\t"+SimpleDate();
    }
}
