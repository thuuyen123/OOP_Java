package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.Department;

public class DepartmentView {
	Scanner sc;


	public DepartmentView() {
		sc = new Scanner(System.in);;
	}
	public void showMessage(String smg){
		System.out.println("--------------");
		System.out.println(smg);
		System.out.println("--------------");
	}
	public int menu(){
		System.out.println("1. Hien thi tat ca department");
		System.out.println("2. Hien thi department theo ten ");
		System.out.println("3. Them department");
		System.out.println("4. Sua department");
		int choice = 0;
		choice = sc.nextInt();
		return choice;
	}
	public Department input(int choice){
		switch (choice) {
		case 2:
			BufferedReader sc2 = new BufferedReader(new InputStreamReader(System.in));
			Department dp = new Department();
			System.out.println("Nhap ten phong ban can tim: ");
			String str;
			try{
				str = sc2.readLine();
				dp.setDeptName(str);
				return dp;
			}catch (IOException e) {
				e.printStackTrace();
			}
		case 3:
			
			try {
				BufferedReader sc3 = new BufferedReader(new InputStreamReader(System.in));
				Department insertD = new Department();
				System.out.println("Them moi department!!");
				System.out.println("DeptID: ");
				insertD.setDeptId(Integer.parseInt(sc3.readLine()));
				System.out.println("DeptName: ");
				insertD.setDeptName(sc3.readLine());
				System.out.println("DeptNo: ");
				insertD.setDeptNo(sc3.readLine());
				System.out.println("Location: ");
//				sc3.readLine();
				insertD.setLocation(sc3.readLine());
				return insertD;
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
				return null;
			}
		case 4:
			try {
				BufferedReader sc3 = new BufferedReader(new InputStreamReader(System.in));
				Department insertD = new Department();
				System.out.println("Sua department!!");
				System.out.println("DeptID: ");
				insertD.setDeptId(Integer.parseInt(sc3.readLine()));
				System.out.println("DeptName: ");
				insertD.setDeptName(sc3.readLine());
				System.out.println("DeptNo: ");
				insertD.setDeptNo(sc3.readLine());
				System.out.println("Location: ");
				insertD.setLocation(sc.nextLine());
				return insertD;
			} catch (NumberFormatException | IOException e) {
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
