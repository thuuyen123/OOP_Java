package Q3;

public class TaiLieu {

    private String ma, tenNXB;
    private int soBPH;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, int soBPH) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBPH = soBPH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBPH() {
        return soBPH;
    }

    public void setSoBPH(int soBPH) {
        this.soBPH = soBPH;
    }
    public String getName(){
        return null;
    }

    public String toString() {
        return ma + "\t" + tenNXB + "\t" + soBPH;

    }
}
