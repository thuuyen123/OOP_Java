package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.Store;

public class StoreView {
	Scanner sc;
	public StoreView(){
		sc = new Scanner(System.in);
	}
	public void showmessage(String mess){
		System.out.println("------------");
		System.out.println(mess);
		System.out.println("-----------");
	}
	public int menu(){
		System.out.println("1. Hien thi tat cac store");
		System.out.println("2. Hien thi store theo ten");
		System.out.println("3. Them store");
		System.out.println("4. Sua store");
		int choice =0;
		choice  = sc.nextInt();
		return choice;
		
	}
	public Store input(int choice){
		switch (choice) {
		case 2:
			BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
			Store s = new Store();
			System.out.println("Nhap ten can tim kiem: ");
			String str;
			try {
				str = scan.readLine();
				s.setName(str);
				return s;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		case 3:
			
			try {
				BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
				Store insertS = new Store();
				System.out.println("Them moi Store");
				System.out.println("Nhap name : ");
				insertS.setName(scan2.readLine());
				System.out.println("Nhap address: ");
				insertS.setAddress(scan2.readLine());
				System.out.println("Nhap descripton: ");
				insertS.setDescription(scan2.readLine());
				return insertS;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		case 4:
			try {
				BufferedReader scan3 = new BufferedReader(new InputStreamReader(System.in));
				Store updateS = new Store();
				System.out.println("Nhap id: ");
				updateS.setId(Integer.parseInt(scan3.readLine()));
				System.out.println("Nhap name : ");
				updateS.setName(scan3.readLine());
				System.out.println("Nhap address: ");
				updateS.setAddress(scan3.readLine());
				System.out.println("Nhap descripton: ");
				updateS.setDescription(scan3.readLine());
				return updateS;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		default:
			break;
		}
		return null;
		
	}
	public void exit() {
		this.sc.close();
	}
}
