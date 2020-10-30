package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

import model.Customer;


public class CustomerView {
	Scanner scan;
	public CustomerView() {
		scan = new Scanner(System.in);
	}
	public void showMessage(String smg) {
		System.out.println("-----------");
		System.out.println(smg);
		System.out.println("-----------");
	}

	public int menu(){
		System.out.println("1. Hien thi tat ca customer");
		System.out.println("2. Hien thi customer theo ten");
		System.out.println("3. Them customer");
		System.out.println("4. Sua customer");
		int choice = 0;
		choice = scan.nextInt();
		return choice;
	}
	public Customer input(int choice){
		switch (choice) {
		case 2:
			BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
			Customer c= new Customer();
			System.out.println("Nhap ten can tim: ");
			String str;
			try {
				str = scan2.readLine();
				c.setName(str);
				return c;
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				return null;
			}
		case 3:
			
			try {
				BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
				
				Customer insert = new Customer();
				System.out.println("Them moi customer");
				
//				System.out.print("id: "); 
//				insert.setId(Integer.parseInt(scan.readLine()));
				
				System.out.println("name: "); 
				insert.setName(scan.readLine());
				
				System.out.println("yearofbirth: ");
				insert.setYearofbirth(scan.readLine());
				
				System.out.println("address: ");
				insert.setAddress(scan.readLine());
				
				System.out.println("idCard");
				insert.setIdCard(scan.readLine());
			
				return insert;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
				
			}
			
		case 4:
			try {
				BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
				
				Customer insert = new Customer();
				System.out.println("Sua customer");
				
				System.out.print("id: "); 
				insert.setId(Integer.parseInt(scan.readLine()));
				
				System.out.println("name: "); 
				insert.setName(scan.readLine());
				
				System.out.println("yearofbirth: ");
				insert.setYearofbirth(scan.readLine());
				
				System.out.println("address: ");
				insert.setAddress(scan.readLine());
				
				System.out.println("idcard");
				insert.setIdCard(scan.readLine());
			
				return insert;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
				
			}
		default:
			break;
		}
		return null;
	}
	public void exit(){
		this.scan.close();
	}
}
