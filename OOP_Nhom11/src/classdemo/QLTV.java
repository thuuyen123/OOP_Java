
package classdemo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class QLTV {
    private ArrayList<TaiLieu> list;
    Scanner in;
    public QLTV(){
        list=new ArrayList<>();
        in=new Scanner(System.in);
        list.add(new Sach("BN123","bbb hh","hgdds",
                "A", 12, 3));
        list.add(new Sach("JH765","ffdsaa","bbnmm",
                "A", 34, 13));
        list.add(new Sach("BS765","nnh5","hdsj df",
                "B", 12, 3));
        list.add(new TapChi("KK876","B",12,
                 12, 3));
        list.add(new TapChi("KK541","C",12,
                 12, 3));
    }    
    private boolean tontaiSach(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return true;
        }
        return false;
    }
    private TaiLieu nhap(){
        String ma,tennxb;
        int sobanph;
        TaiLieu t=null;
        System.out.print("Nhap ma:");
        while(true){
            ma=in.nextLine().toUpperCase();
            if((!tontaiSach(ma))&& 
                    (ma.matches("^[A-Z]{2}\\d{3}")))
                break;
            System.out.print("nhap lai ma:");
        }
        System.out.print("Ten:");
        tennxb=in.nextLine();
        System.out.print("So ban PH:");
        sobanph=Integer.parseInt(in.nextLine());
        t=new TaiLieu(ma, tennxb, sobanph);
        return t;
    }
    public void nhapSach(){
        TaiLieu t=nhap();
        String tentg,tens;
        int strang;
        System.out.print("Ten sach:");
        tens=in.nextLine();
        System.out.print("Ten tac gia:");
        tentg=in.nextLine();
        System.out.print("so trang:");
        strang=Integer.parseInt(in.nextLine());
        list.add(new Sach(t.getMa(), tens, tentg, 
                t.getTennxb(), strang, t.getSobanph()));
    }
    public void nhapTapChi(){
        TaiLieu t=nhap();
        int soph,thang;
        System.out.print("So PH:");
        soph=Integer.parseInt(in.nextLine());
        System.out.print("thang:");
        thang=Integer.parseInt(in.nextLine());
        list.add(new TapChi(t.getMa(),  
                t.getTennxb(), t.getSobanph(),soph,thang));
    }
    public void hthi(){
        int count=0;
        System.out.println("========Sach======");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Sach){
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("Tong so sach:"+count);
        System.out.println("================");
        count=0;
        System.out.println("========Tap chi======");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof TapChi){
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("Tong so Tap chi:"+count);
        System.out.println("================");
    }
    private int TimSachTheoMa(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }    
    public void xoa(){
        System.out.print("nhap ma can xoa:");
        String ma=in.nextLine();
        int vt=TimSachTheoMa(ma);
        if(vt==-1)
            System.out.println("Co dau ma xoa");
        else{
            list.remove(vt);
            System.out.println("xoa thanh cong");
        }
    }
    public void suaTaiLieu(){
        System.out.print("nhap ma can sua:");
        String ma=in.nextLine();
        int vt=TimSachTheoMa(ma);
        if(vt==-1)
            System.out.println("Co dau ma sua");
        else{
            String tennxb;
            int sobanph;
            System.out.print("Ten sua:");
            tennxb=in.nextLine();
            System.out.print("So ban PH sua:");
            sobanph=Integer.parseInt(in.nextLine());
            TaiLieu t=list.get(vt);
            t.setSobanph(sobanph);
            t.setTennxb(tennxb);
            System.out.println("sua thanh cong");
        }
    }
    private ArrayList<String> getTenNXB(){
        HashSet<String> hs=new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getTennxb());
        }
        return new ArrayList<>(hs);
    }
    public void thongketheoTenNXB(){
        ArrayList<String> ar=getTenNXB();
        int count=0;
        for (int i = 0; i < ar.size(); i++) {
            count=0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getTennxb().equalsIgnoreCase(ar.get(i)))
                    count++;
            }
            System.out.println(ar.get(i)+" :"+count);
        }
    }
    
}
