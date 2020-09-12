package bai6;

public class KhachHang {
    private int idKH;
    private String gt;
    private int tuoi;

    public KhachHang() {
    }

    public KhachHang(int idKH, String gt, int tuoi) {
        this.idKH = idKH;
        this.gt = gt;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "idKH=" + idKH +
                ", gt='" + gt + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
