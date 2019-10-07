/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author mac
 */
public class GV {
    private String maGV, tenGV, email, diaChi;
    private int hocHam, hocVi, dienThoai, soGioGiangDay;
    private double heSoLuong;

    public GV() {
    }
    private double tinhHeSoLuong(int hocHam, int hocVi) {
        double sum = 0;
        switch (hocHam) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 0.2;
                break;
            case 3:
                sum = 0.1;
                break;
            default:
                break;
        }
        switch (hocVi) {
            case 1:
                sum += 1;
                break;
            case 2:
                sum += 1.1;
                break;
            case 3:
                sum += 1.2;
                break;
        }
        return sum;
    }
    
    public GV(String maGV, String tenGV, String email, String diaChi, int hocHam, int hocVi, int dienThoai, int soGioGiangDay) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.email = email;
        this.diaChi = diaChi;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.dienThoai = dienThoai;
        this.soGioGiangDay = soGioGiangDay;
        this.heSoLuong = tinhHeSoLuong(hocHam, hocVi);
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setDienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setHocHam(int hocHam) {
        this.hocHam = hocHam;
    }

    public void setHocVi(int hocVi) {
        this.hocVi = hocVi;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public void setSoGioGiangDay(int soGioGiangDay) {
        this.soGioGiangDay = soGioGiangDay;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getEmail() {
        return email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getHocHam() {
        return hocHam;
    }

    public int getHocVi() {
        return hocVi;
    }

    public int getDienThoai() {
        return dienThoai;
    }

    public int getSoGioGiangDay() {
        return soGioGiangDay;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getLuongLinh(){
        return 0;
    }
    
    public String inHocHam(){
        switch (hocHam) {
            case 1:
                return "Khong";
            case 2:
                return "GS";
            default:
                return "PGS";
        }
    }
    
    public String inHocVi(){
        switch (hocVi) {
            case 1:
                return "DH";
            case 2:
                return "ThS";
            default:
                return "TS";
        }
    }
    
    @Override
    public String toString(){
        return maGV + "\t" + tenGV + "\t" + email + "\t" + inHocHam() + "\t"
                + inHocVi() + "\t" + diaChi + "\t" + dienThoai + "\t" + soGioGiangDay + "\t" + heSoLuong;
    }
}
