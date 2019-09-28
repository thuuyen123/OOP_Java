
package bt2;


public class SinhVien {
   //thuoc tinh
   private String ma,ten,dchi;
   private int tuoi;
   private double dlthdt;
   private boolean uutien;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, 
            int tuoi,String dchi, 
            double dlthdt, boolean uutien) {
        this.ma = ma;
        this.ten = ten;
        this.dchi = dchi;
        this.tuoi = tuoi;
        this.dlthdt = dlthdt;
        this.uutien = uutien;
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

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDlthdt() {
        return dlthdt;
    }

    public void setDlthdt(double dlthdt) {
        this.dlthdt = dlthdt;
    }

    public boolean isUutien() {
        return uutien;
    }

    public void setUutien(boolean uutien) {
        this.uutien = uutien;
    }
   public String toString(){
       return ma+"\t"+ten+"\t"+tuoi+"\t"+dchi;
   }
   
}
