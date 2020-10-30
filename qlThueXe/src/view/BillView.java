package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.Bill;

public class BillView {
	Scanner sc;
	public BillView(){
		sc = new Scanner(System.in);
	}
	public void showMess(String mess){
		System.out.println("----------------");
		System.out.println(mess);
		System.out.println("--------------");
	}
	public int menu(){
		System.out.println("1. Hien thi tat ca bill");
		System.out.println("2. Hien thi bill theo amount");
		System.out.println("3. Them bill");
		System.out.println("4. Sua bill");
		int choice = 0;
		choice = sc.nextInt();
		return choice;
	}
	public Bill input(int choice){
		switch (choice) {
		case 2:
			BufferedReader sc1 = new BufferedReader(new InputStreamReader(System.in));
			Bill b = new Bill();
			System.out.println("Nhap amount can tim trong bill: ");
			try {
				b.setAmount(Integer.parseInt(sc1.readLine()));
				return b;
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		case 3:
			
			try {
				BufferedReader sc2 = new BufferedReader(new InputStreamReader(System.in));
				Bill insertB = new Bill();
				System.out.println("Them bill");
				
				System.out.println("Amount: ");
				insertB.setAmount(Float.parseFloat(sc2.readLine()));
				
				System.out.println("TblHiring_id: ");
				insertB.setTblHiring_id(Integer.parseInt(sc2.readLine()));
				
				return insertB;
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		case 4:
			try {
				BufferedReader sc3 = new BufferedReader(new InputStreamReader(System.in));
				Bill updateB = new Bill();
				System.out.println("Cap nhat bill");
				
				System.out.println("ID: ");
				updateB.setId(Integer.parseInt(sc3.readLine()));
				
				System.out.println("Amount: ");
				updateB.setAmount(Float.parseFloat(sc3.readLine()));
				
				System.out.println("TblHiring_id: ");
				updateB.setTblHiring_id(Integer.parseInt(sc3.readLine()));
				
				return updateB;
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		default:
			break;
		}
		return null;
	}
	public void exit(){
		this.sc.close();
	}
}
