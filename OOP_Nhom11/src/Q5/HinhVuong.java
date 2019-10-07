package Q5;
import java.util.Scanner;
public class HinhVuong implements Hinh2D {
	private int x;
	public HinhVuong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HinhVuong(int x) {
		super();
		this.x = x;
	}
	/*public void Nhap() {
		System.out.print("Nhap do dai canh hv: ");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
	}*/
	public double ChuVi() {
		return 4*x;
	}
	public double DienTich() {
		return x*x;
	}
	public int SoDinh() {
		return 4;
	}
	public int SoCanh() {
		return 4;
	}
}
