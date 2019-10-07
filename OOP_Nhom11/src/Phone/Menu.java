package T27_9_2019;

import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {
		QLDT N=new QLDT();
		Scanner input=new Scanner(System.in);
		System.out.print("-------------Menu-------------\n");
		System.out.print("1.Nhap noi hat: \n");
		System.out.print("2.Nhap QT:  \n");
		System.out.print("3.Sua\n");
		System.out.print("4.Tim kiem theo ten\n");
		System.out.print("5.Tim kiem theo duoi\n");
		System.out.print("6.Tinh tong cho vung\n");
		//System.out.print("7.Hien thi\n");
		System.out.print("0.Thoat\n");
		System.out.print("_____________________________________\n");
		int choose;
		do {
			System.out.print("Chon chuc nang: ");
			choose=input.nextInt();
			switch(choose) {
				case 1:
					N.Nhapnoihat();
					break;
				case 5:
					N.TimKiemTheoMV();
					break;
				default: break;
			}
		}while(choose>0&&choose<10);
		
	}
}
