
package astractclass;
import java.util.ArrayList;
import java.util.Scanner;

public class QLDT {
    private ArrayList<DienThoai> list;
    private Scanner in;
    public QLDT(){
        list=new ArrayList<>();
        in=new Scanner(System.in);
    }
    private boolean tontaiDienthoai(String seri){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSeri().equalsIgnoreCase(seri))
                return true;
        }
        return false;
    }
    public void nhap(){
        String seri,ten,hang;
        double gia;
        System.out.print("Seri:");
        while(true){
            seri=in.nextLine().toUpperCase();
            if((!tontaiDienthoai(seri))&&
                    (seri.matches("[A-Z]{2}\\d{3}")))
                break;
            System.err.println("sai dinh dang hoac da co");
            System.out.print("Nhap lai ma:");
        }
        System.out.print("Nhap ten:");
        ten=in.nextLine();
        System.out.print("Nhap Hang:");
        hang=in.nextLine();
        System.out.print("Nhap gia:");
        gia=Double.parseDouble(in.nextLine());
        list.add(new DienThoai(seri, ten, hang, gia));
    }
    public void hthi(){
        System.out.println("=================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println("=================");
    }
    private int searchBySeri(String seri){
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSeri().equalsIgnoreCase(seri))
                return i;
        }
        return -1;
    }
    public void xoa(){
        System.out.print("Nhap seri can xoa:");
        String seri=in.nextLine();
        int vt=searchBySeri(seri);
        if(vt==-1)
            System.out.println("co dau ma xoa");
        else{
            list.remove(vt);
            System.out.println("xoa thanh cong");
        }
    }
    public void sua(){
        System.out.print("Nhap seri can sua:");
        String seri=in.nextLine();
        int vt=searchBySeri(seri);
        if(vt==-1)
            System.out.println("co dau ma sua");
        else{
            String ten,hang;
            double gia;
            System.out.print("Nhap ten moi:");
            ten=in.nextLine();
            System.out.print("Nhap Hang moi:");
            hang=in.nextLine();
            System.out.print("Nhap gia moi:");
            gia=Double.parseDouble(in.nextLine());
            DienThoai d=list.get(vt);
            d.setHang(hang);
            d.setTen(ten);
            d.setGia(gia);
            System.out.println("sua thanh cong!!");
        }
    }
    public void timTheoTen(){
        System.out.print("Nhap ten can tim:");
        String ten=in.nextLine();
        System.out.println("===========");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTen().indexOf(ten)>=0)
                System.out.println(list.get(i).toString());
        }
        System.out.println("===========");
    }
    public void timTheoGia(){
        System.out.print("Nhap tu gia:");
        double gia1=Double.parseDouble(in.nextLine());
        System.out.print("Nhap den gia:");
        double gia2=Double.parseDouble(in.nextLine());
        System.out.println("===========");
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i).getGia()>=gia1)&&(list.get(i).getGia()<=gia2))
                System.out.println(list.get(i).toString());
        }
        System.out.println("===========");
    }
}
