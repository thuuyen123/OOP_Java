
package bai4;

public class GVCoHuu extends GV{
    private double luongThoaThuan;
    private int soGioQuyDinh;
    
    public GVCoHuu() {
        
    }

    public GVCoHuu(String maGV, String tenGV, String email, String diaChi, int hocHam, int hocVi, int dienThoai, int soGioGiangDay, double luongThoaThuan, int soGioQuyDinh) {
        super(maGV, tenGV, email, diaChi, hocHam, hocVi, dienThoai, soGioGiangDay);
        this.luongThoaThuan = luongThoaThuan;
        this.soGioQuyDinh = soGioQuyDinh;
    }

    public void setLuongThoaThuan(double luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }

    public void setSoGioQuyDinh(int soGioQuyDinh) {
        this.soGioQuyDinh = soGioQuyDinh;
    }

    public double getLuongThoaThuan() {
        return luongThoaThuan;
    }

    public int getSoGioQuyDinh() {
        return soGioQuyDinh;
    }
    
    @Override
    public double getLuongLinh(){
        return (luongThoaThuan + (super.getSoGioGiangDay()-soGioQuyDinh)*50000)*super.getHeSoLuong();
    }
    
    @Override
    public String toString(){
        return super.toString() + "\t" + luongThoaThuan + "\t" + soGioQuyDinh;
    }
}
