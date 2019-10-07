/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author Admin
 */
public class GV {
    private String ma, ten, email;
    private int hocham, hocvi;
    private String diachi, sdt;
    private int sogio;
    private double heso;

    public GV() {
    }

    public GV(String ma, String ten, String email, int hocham, int hocvi, String diachi, String sdt, int sogio) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.hocham = hocham;
        this.hocvi = hocvi;
        this.diachi = diachi;
        this.sdt = sdt;
        this.sogio = sogio;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHocham() {
        return hocham;
    }

    public void setHocham(int hocham) {
        this.hocham = hocham;
    }

    public int getHocvi() {
        return hocvi;
    }

    public void setHocvi(int hocvi) {
        this.hocvi = hocvi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getSogio() {
        return sogio;
    }

    public void setSogio(int sogio) {
        this.sogio = sogio;
    }

    public double getHeso() {
       return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }
    public double tinhtongluong() {
        return 0;
    }
    
    public String inHocHam(int hocham) {
        if(hocham==0) return "Khong";
        else if(hocham==1) return "Giao su";
        else if(hocham==2) return "Pho giao su";
        else return null;
    }
    public String inHocVi(int hocvi){
        if(hocvi==0) return "Dai hoc";
        else if(hocvi==1) return "Thac si";
        else if(hocvi ==2) return "Tien si";
        else return null;
    }   
    public double tinhheso(int hocham,int hocvi){
       if(hocvi==0) heso=1;
       else if(hocvi==1) heso=1.1;
       else if(hocvi==2) heso= 1.2;
       double tmp=heso;
       if(hocham==1) tmp+=0.2;
       else if(hocham==2) heso+=0.1;
       return tmp;
    }
    public void display(){
        System.out.println(ma+"\t\t"+ten+"\t\t"+email+"\t\t"+inHocHam(hocham)+"\t\t"+inHocVi(hocvi)
        +"\t\t"+diachi+"\t\t"+sdt+"\t\t"+sogio+"\t\t"+tinhheso(hocham, hocvi));
    }
}
