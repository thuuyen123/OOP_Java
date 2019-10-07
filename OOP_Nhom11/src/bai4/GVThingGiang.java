
package bai4;

public class GVThingGiang extends GV{
    private String coQuanLamViec;

    public GVThingGiang() {
    }

    public GVThingGiang(String maGV, String tenGV, String email, String diaChi, int hocHam, int hocVi, int dienThoai, int soGioGiangDay, double heSoLuong, String coQuanLamViec) {
        super(maGV, tenGV, email, diaChi, hocHam, hocVi, dienThoai, soGioGiangDay);
        this.coQuanLamViec = coQuanLamViec;
    }

    @Override
    public double getLuongLinh(){
        return ((super.getSoGioGiangDay())*200000*super.getHeSoLuong());
    }

    public String getCoQuanLamViec() {
        return coQuanLamViec;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\t" + coQuanLamViec;
    }
}
