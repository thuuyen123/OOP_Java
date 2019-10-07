package T27_9_2019;
import java.util.ArrayList;
import java.util.Scanner;
public class QLDT {
	private ArrayList<PhoneNumber> list;
	private Scanner in;
	public QLDT() {
		in=new Scanner(System.in);
		list=new ArrayList();
	}
	private PhoneNumber Nhap(){
		int area;
		String number;
		String anum;
		while(true) {
			anum=in.nextLine();
			if(anum.matches("\\d+")) {
				break;
			}
			System.out.print("Nhap lai");
		}
		area=Integer.parseInt(anum);
		number=in.nextLine();
		return new PhoneNumber(area,number);
	}
	public void Nhapnoihat() {
		PhoneNumber p=Nhap();	
		list.add(p);
	}
	public void NhapQT() {
		String cc;
		cc=in.nextLine();
		PhoneNumber p=Nhap();
		list.add(new IntPhoneNumber(cc,p.getArea(),p.getNumber()));
	}
	
	public void HienThi() {
		
		for(int i=0;i<list.size();i++) {
			list.get(i).display();
		}
	}
	public void TimKiemTheoMV() {
		System.out.println("Nhap vao ma vung can tim: ");
		int area=Integer.parseInt(in.nextLine());
		for(int i=0;i<list.size();i++) {
			if(list.get(i) instanceof PhoneNumber && list.get(i).getArea()==area) {
				list.get(i).display();
			}
		}
	}
	public void TimKiemTheoDuoi() {
		System.out.println("Nhap vao duoi can tim: ");
		String duoi=in.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getNumber().endsWith(duoi)) {
				list.get(i).display();
			}
		}
	} 
	
	
}
